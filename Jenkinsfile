pipeline {
    agent any
    stages {
        stage ('Checkout') {
          steps {
            git 'https://github.com/iklymchuk/GTest.git'
          }
        }
        stage ('Clean build') {
                  steps {
                    bat 'gradle clean'
                }
        }
         stage('Unit test') {
                    steps {
                        bat 'gradle -Dtest.single=CalculatorTest test'
                    }
        }

        stage('Integration test') {
                    steps {
                         bat 'gradle -Dtest.single=ApiTest test'
                   }
        }

        stage('Publish report') {
                      steps {
                        archive (includes: 'build/spock-reports/*.html')

                        publishHTML([
                            allowMissing: false,
                            alwaysLinkToLastBuild: false,
                            keepAll: false,
                            reportDir: 'build/spock-reports',
                            reportFiles: 'index.html',
                            reportName: 'Spock Report',
                            reportTitles: 'Spock Report'])
                      }
        }

    }
    post {
        always {
            junit 'build/test-results/**/TEST-*.xml'
        }
    }
}