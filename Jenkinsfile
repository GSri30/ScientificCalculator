pipeline {
    tools {
        maven "3.9.1"
    }
    
    agent any

    environment
    {
        registry = "gsri30/calculator"
        registryCredential = "dockerhub"
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
    }
}