pipeline {
    agent any

        stage('Build') {
                     def javatool = tool name: 'java', type: 'jdk'
                     def mavenhome = tool name: 'maven', type: 'maven'
                     withEnv(["JAVA_HOME=${javatool}"]) {
                     sh """
                        ${mavenhome}/bin/mvn -B -f ${WORKSPACE}/pom.xml clean package 
                     """
        
                    }
        }
        stage('Test') {
                    def  javatool = tool name: 'java', type: 'jdk'
                    def  mavenhome = tool name: 'maven', type: 'maven'
                     withEnv(["JAVA_HOME=${javatool}"]) {
                     sh """
                        ${mavenhome}/bin/mvn -B -f ${WORKSPACE}/pom.xml clean verify 
                     """
        
                    }
        }
       
}
