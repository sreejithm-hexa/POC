@Library('shared-example') import com
pipeline {
   agent any
	def utils = new MavenUtil(this)
    stages {
	    stage {
		    steps {
			     utils.mvn 'clean package'
		    }
	    }
    }
}
			    
		    
