@Library("shared-lib") _

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                execGradle("test")
                execGradle("build")
            }
        }    
    }
}