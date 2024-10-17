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
            steps { bat "docker build -t expsense-tracker "
                    bat "docker run -p 8020:8020 -d  expsense-tracker "}
        }
        }
        }

