pipeline {
    agent any
    stages {
        stage ('Checkout') {
          steps {
            git 'https://github.com/iklymchuk/GTest.git'
          }
        }
        stage ('Gradle version') {
                  steps {
                    bat 'gradle -version'
                }
        }
         stage('Unit test') {
                    steps {
                        bat 'gradle -Dtest.single=CalculatorTest clean test'
                    }
        }
    }
}