pipeline {
  agent any
  stages {
    stage('Start') {
      parallel {
        stage('Start') {
          steps {
            echo 'Hello Maven'
          }
        }

        stage('tools') {
          steps {
            tool(name: 'maven', type: 'M3')
          }
        }

      }
    }

  }
}