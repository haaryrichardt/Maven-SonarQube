pipeline {
    agent any
    tools {
        maven "Maven"   
    }    
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage("build & SonarQube analysis"){
            agent any
            steps{
                withSonarQubeEnv('sonarqube'){
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }
    }
}
