pipeline {
    agent any
    stages {
        stage ('Checkout') {
          steps {
            git 'https://github.com/iklymchuk/GTest.git'
          }
        }
         stage('Test') {
                    steps {
                        bat 'gradle -version'
                    }
        }

    }
}