pipeline {
    tools {
        maven "3.9.1"
    }
    
    agent any

    environment
    {
        registry = "gsri30/scientific-calculator"
        registryCredential = "DockerHUB"
        dockerImage = ""
    }

    stages {
        stage('Pull GitHub') {
            steps {
                git branch: 'main', url: 'https://github.com/GSri30/ScientificCalculator.git'
            }
        }
        stage('Build Maven jar package') {
            steps {
                dir("ScientificCalculator/") {
                    script{
                        sh 'mvn clean install'
                    }
                }
            }
        }
        stage('Docker Image Build') {
            steps {
                script {
                    dockerImage = docker.build(registry + ":latest")
                }
            }
        }
        stage('DockerHub Image Push') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Cleaning Up') {
            steps {
                sh "docker rmi $registry:latest" 
            }
        }
    }
}