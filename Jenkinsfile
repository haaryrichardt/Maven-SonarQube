pipeline {
    agent any
    tools {
        maven "Maven"   
    }    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage("Sonar Code Analysis"){
            steps{
                withSonarQubeEnv('sonar'){
                    sh 'mvn sonar:sonar'
                    //org.codehaus.mojo:sonar-maven-plugin::sonar can alternatively used for sonar:sonar
                }
            }
        }
        stage("publish"){
            steps{
                  nexusArtifactUploader credentialsId: '44c0662e-9030-4882-8aa3-b804b1a41316', groupId: 'hexagon6', nexusUrl: '18.224.155.110:8081/nexus', nexusVersion: 'nexus2', protocol: 'http', repository: 'hexagon', version: '2.14.13-01'
            }
        }
     
    }
}
