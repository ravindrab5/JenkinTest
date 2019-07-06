pipeline {
    agent any
    stages{
      stage('SCM Checkout'){
        git clone "https://github.com/ravindrab5/JenkinTest.git"
       }
      stage('Compile stage'){
         steps{
            withMaven(maven:'LOCALMAVEN'){
               sh 'mvn clean compile'
            }
         }
      }
   } 
  }
