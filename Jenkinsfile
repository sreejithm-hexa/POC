@Library('shared-example')_
import com.app.*

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
			    
		    
