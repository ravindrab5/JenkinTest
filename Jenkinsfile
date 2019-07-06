pipeline {
    agent any
    stages{
      stage('SCM Checkout'){
        GIT clone "https://github.com/ravindrab5/JenkinTest.git"
       }
      stage('Compile stage'){
         steps{
            WITHMAVEN(MAVEN:'LocalMaven'){
               SH 'MVN clean compile'
            }
         }
      }
   } 
  }
