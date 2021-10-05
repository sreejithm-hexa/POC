@Library('shared-example')_


def utils = new MavenUtil(this)
	
pipeline {
   agent any
    stages {
	    node() {
	    	stage ('MVN') {
		    steps {
			    script {
			     utils.mvn 'clean package'
			    }
		    }
	    	}
	    }
    }
}
			    
		    
