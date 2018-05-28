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

        stage('Integration test') {
                    steps {
                         bat 'gradle -Dtest.single=ApiTest clean test'
                   }
        }

        stage('Publish report') {
                      steps {
                        archive (includes: 'pkg/*.gem')

                        publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'build/spock-reports', reportFiles: 'index.html', reportName: 'Spock Report', reportTitles: ''])
                      }
        }

    }
    post {
        always {
            junit 'build/test-results/**/TEST-*.xml'
        }
    }
}