@Library('shared-example')_
import com.code
def utils = new MavenUtil(this)
pipeline {
   agent any
    stages {
	    stage ('MVN') {
		    steps {
			     utils.mvn 'clean package'
		    }
	    }
    }
}
			    
		    
