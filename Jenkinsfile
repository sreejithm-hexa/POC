@Library('shared-example')_
import com.app.MavenUtil


def utils = new MavenUtil(this)
/*node	{
  utils.mvn 'clean package'
}*/
pipeline {
	agent any {
		stages {
			stage("Maven Ops") {
				utils.mvn 'clean package'
			}
		}
	}
}
		    
