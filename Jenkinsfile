@Library('shared-example')_
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
		       sh '/opt/gradle/gradle-6.4.1/bin/gradle install'
            }
        }
	stage ('MAVEN') {
	        steps {
		       sh '/opt/apache-maven-3.6.3/bin/mvn clean install'
            }
        }
        stage ('test') {
	        steps {
		       Execute('test')
            }
        }
	stage ('Tempertaure conversion') {
		steps {
			temp(98)
		}
	}
    }
}
