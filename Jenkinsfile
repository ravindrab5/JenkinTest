pipeline {
    agent any
    stages {
      stage('SCM Checkout') {
	  steps {
            git "https://github.com/ravindrab5/JenkinTest.git"
          }
       }
      stage('Compile stage') {
         steps {
            withMaven(maven:'LOCALMAVEN') {
               sh 'mvn compile'
            }
         }
      }
   } 
  }
