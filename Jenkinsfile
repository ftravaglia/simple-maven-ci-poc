pipeline {
    agent any

    tool maven: 'maveb', type: 'maven'

    stages {
        stage('Build') {
            steps {
                     javatool = tool name: 'JDK8x64', type: 'jdk'
                     mavenhome = tool name: 'Maven 3.3.9', type: 'maven'
                     withEnv(["JAVA_HOME=${javatool}"]) {
                     sh """
                        ${mavenhome}/bin/mvn -B -f ${WORKSPACE}/pom.xml clean package 
                     """
        
                    }
            }
        }
        stage('Test') {
            steps {
                javatool = tool name: 'JDK8x64', type: 'jdk'
                     mavenhome = tool name: 'Maven 3.3.9', type: 'maven'
                     withEnv(["JAVA_HOME=${javatool}"]) {
                     sh """
                        ${mavenhome}/bin/mvn -B -f ${WORKSPACE}/pom.xml clean verify 
                     """
        
                    }
            }
        }
       
    }
}
