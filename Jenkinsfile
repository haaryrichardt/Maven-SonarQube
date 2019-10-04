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
                  nexusPublisher nexusInstanceId: 'wipronexus', nexusRepositoryId: 'hexagon6', packages: []
            }
        }
        //nexusPublisher nexusInstanceId: 'wipronexus', nexusRepositoryId: 'hexagon6', packages: []
    }
}
