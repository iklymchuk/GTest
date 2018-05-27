pipeline {
    agent none
    stages {
        stage ('Checkout') {
          steps {
            git 'https://github.com/iklymchuk/GTest.git'
          }
        }
        stage('Build') {
            steps {
                 bat 'gradle -Dtest.single=CalculatorTest clean test'
            }
        }
    }
}