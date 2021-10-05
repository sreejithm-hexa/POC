@Library('shared-example')_
import com.app.MavenUtil


def utils = new MavenUtil(this)

pipeline {
  agent any 
  stages {
  	stage("Maven Ops") {
		steps {
			script {
				utils.mvn 'clean package'
			}
		}
	}
  }	
}
		    
