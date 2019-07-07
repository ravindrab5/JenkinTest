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
     stage('Test stage') {
         steps {
            withMaven(maven:'LOCALMAVEN') {
               sh 'mvn test'
            }
         }
      }
      stage('install stage') {
         steps {
            withMaven(maven:'LOCALMAVEN') {
               sh 'mvn install'
            }
         }
      }
     stage('package stage') {
         steps {
            withMaven(maven:'LOCALMAVEN') {
               sh 'mvn package'
            }
         }
      }
   } 
  }
