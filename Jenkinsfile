pipeline {
  agent any
  stages {
    stage('Start') {
      steps {
        echo 'Hello Maven'
        bat(script: 'mvn --version', returnStdout: true, returnStatus: true, label: 'mvnVersion')
        sh 'sh mvn --version'
      }
    }

  }
}