pipeline {
    agent any
    stages {
        stage ('Checkout') {
          steps {
            git 'https://github.com/iklymchuk/GTest.git'
          }
        }
        stage ('gradle version') {
                  steps {
                    bat 'C:\Gradle\gradle-4.7\bin\gradle -version'                  }
                }
         stage('Test') {
                    steps {
                        bat 'C:\Gradle\gradle-4.7\bin\gradle -Dtest.single=CalculatorTest clean test'
                    }
        }
    }
}