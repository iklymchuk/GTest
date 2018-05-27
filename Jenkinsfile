pipeline {
    agent { docker 'gradle:4.5-jdk8-alpine' }
    stages {
        stage ('Checkout') {
          steps {
            git 'https://github.com/iklymchuk/GTest.git'
          }
        }
        stage('Build') {
            steps {
                sh 'gradle -Dtest.single=CalculatorTest clean test'
            }
        }
    }
}