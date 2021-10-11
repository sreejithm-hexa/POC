@Library('shared-example')_
import com.app.MavenUtil

def props = readProperties  file:'dir/jenkins.properties'
//def utils = new MavenUtil(this)

pipeline {
  agent any 
   stages {
	   stage ('Test') {
	        steps {
			script {
		       		props(MavenInstall)
			}
            }
        }
   }	
}
		    
