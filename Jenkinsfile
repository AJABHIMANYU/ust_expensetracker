pipeline {
    agent any
        tools{
            maven 'my-maven'
            jdk 'my-jdk'
    }


    stages {
        stage('Clone') {
            steps {
                git url:'https://github.com/AJABHIMANYU/ust_expensetracker.git', branch:'master'
            }
        }

        stage('Build') {
            steps {
               bat "mvn clean install -DskipTests"}
            }
        stage('Test') {
            steps
            {bat "mvn test"}
        }
        stage('Deploy') {
            steps { bat "docker build -t auth-image ."
                    bat "docker run -p 8020:8020 -d --name auth-container auth-image"}
        }
        }
        }

