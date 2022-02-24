pipeline{
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build Maven') {
            steps{
               checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/devopshint/jenkins-docker-example']]])
                sh "mvn -Dmaven.test.failure.ignore=true clean install"

            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                  sh 'docker build -t aparna/my-app:1.0 .'
                }
            }
        }
        stage('Run Docker Image') {
            steps {
                script {
                  sh 'docker run -p 8080:8080 aparna/my-app:1.0'
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script {
                  sh 'docker push aparna/my-app:1.0'
                }
            }
        }
    }
}