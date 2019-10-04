pipeline {
    agent any
    tools {
        maven "Maven"   
    }    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test')
        {
            steps{
            sh 'mvn test'
            }
        }
        //stage("Sonar Code Analysis"){
        //    steps{
         //       withSonarQubeEnv('sonar'){
           //         sh 'mvn sonar:sonar'
                    //org.codehaus.mojo:sonar-maven-plugin::sonar can alternatively used for sonar:sonar
             //   }
            //}
        //}
        stage("publish"){
            steps{
                  nexusArtifactUploader artifacts: [[artifactId: 'test', classifier: '', file: 'test-0.0.1-SNAPSHOT.jar', type: 'jar']], credentialsId: '44c0662e-9030-4882-8aa3-b804b1a41316', groupId: 'com.maven', nexusUrl: '18.224.155.110:8081/nexus/', nexusVersion: 'nexus2', protocol: 'http', repository: 'hexagon6', version: '0.0.1-SNAPSHOT'
            }
        }
     
    }
}
