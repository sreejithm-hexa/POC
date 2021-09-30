@Library("Shared-Library") _

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