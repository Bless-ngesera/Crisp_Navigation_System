pipeline {
    agent any

    tools {
        maven 'MAVEN_HOME'  // Use the Maven installation configured in Jenkins
    }

    environment {
        POM_PATH = 'Task6/pom.xml'  // Path to your parent POM file
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Bless-ngesera/Crisp_Navigation_System.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    echo "Building project with Maven..."
                    bat "mvn -f ${POM_PATH} clean install"
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo "Running unit tests..."
                    bat "mvn -f ${POM_PATH} test"
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    echo "Packaging application..."
                    bat "mvn -f ${POM_PATH} package"
                }
            }
        }

        stage('Deploy') {
            steps {
                echo "Deployment stage (modify as needed)..."
            }
        }
    }

    post {
        success {
            echo "Pipeline executed successfully! 🎉"
        }
        failure {
            echo "Pipeline failed! Check the logs. ❌"
        }
    }
}
