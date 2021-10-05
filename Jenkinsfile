@Library('shared-example')_
import com.app.MavenUtil


def utils = new MavenUtil(this)

pipeline {
  agent any 
   stages {
  	stage("pack") {
		steps {
			echo %maven_home%
			script {
				
				utils.mvn 'clean package'
			}
		}
	}
	stage("install ") {
		steps {
			script {
				utils.mvn 'clean install'
			}
		}
	}
   }	
}
		    
