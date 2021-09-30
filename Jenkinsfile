  
  def image
  def gardleHome = tool 'gradle'

  
     stage ('checkout') {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://HexOne@dev.azure.com/HexOne/PV/_git/Sample-java-project-2']]])       
        }
    
    
    stage ('Build') {
            sh '/opt/gradle/gradle-6.4.1/bin/gradle build'            
        }
}