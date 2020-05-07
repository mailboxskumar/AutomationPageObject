pipeline {
  agent any
  stages {
    stage('Start') {
      steps {
        echo 'Hello Maven'
        bat(script: 'mvn --version', returnStdout: true, returnStatus: true, label: 'mvnVersion')
        powershell(script: 'mvn --version', returnStatus: true, returnStdout: true)
      }
    }

  }
}