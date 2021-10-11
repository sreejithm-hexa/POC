@Library('shared-example')_
import com.app.MavenUtil

def props = readProperties  file:'dir/jenkins.properties'
def vars = props['mavenInstall']
//def utils = new MavenUtil(this)

pipeline {
  agent any 
   stages {
	   stage ('Test') {
	        steps {
			echo vars
            }
        }
   }	
}
		    
