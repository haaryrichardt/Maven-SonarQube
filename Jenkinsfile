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
                  nexusArtifactUploader artifacts: [[artifactId: 'test', classifier: '', file: 'pom.xml', type: 'jar']], credentialsId: '48228fc5-946d-4314-b876-a1182e48a864', groupId: 'com.maven', nexusUrl: '18.224.155.110:8081/nexus', nexusVersion: 'nexus2', protocol: 'http', repository: 'hexagon', version: '0.0.1-SNAPSHOT'
            }
        }
     
    }
}
