@Library('shared-lib-unitTesting')_
pipeline {
    agent any
    stages {
	 stage ('Clean') {
	        steps {
		       sh '/opt/gradle/gradle-6.4.1/bin/gradle clean'
            }
        }
	stage ('Build') {
	        steps {
		       sh '/opt/gradle/gradle-6.4.1/bin/gradle build'
            }
        }
        stage ('test') {
	        steps {
		       Excecute('test')
            }
        }
	stage ('Tempertaure conversion') {
		steps {
			temp(98)
		}
	}
    }
}
