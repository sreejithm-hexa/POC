@Library('shared-example')_
pipeline {
   agent any
    stages {
	 stage ('Clean') {
	        steps {
		       sh '/opt/apache-maven-3.6.3/bin/mvn clean'
            }
        }
	stage ('Tempertaure conversion') {
		steps {
			temp(98)
		}
	}
    }
}
