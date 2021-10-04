@Library('shared-example') import com
pipeline {
   agent any
	def utils = new MavenUtil(this)
    stages {
	    stage ('MVN') {
		    steps {
			     utils.mvn 'clean package'
		    }
	    }
    }
}
			    
		    
