@Library('shared-example') import com.code.app.code

def utils = new MavenUtil(this)
pipeline {
   agent any
    stages {
	    stage ('MVN') {
		    steps {
			    script {
			     utils.mvn 'clean package'
			    }
		    }
	    }
    }
}
			    
		    
