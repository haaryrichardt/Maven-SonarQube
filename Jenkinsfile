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
                    sh 'mvn org.codehaus.mojo:sonar-maven-plugin::sonar'
                    //org.codehaus.mojo:sonar-maven-plugin::sonar can alternatively used
                }
            }
        }
    }
}
