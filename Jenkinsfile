
properties([pipelineTriggers([githubPush()])])

pipeline {
    agent any
    stages {
        stage('Checkout SCM') {
            steps {
                checkout([
                 $class: 'GitSCM',
                 branches: [[name: 'main']],
                 userRemoteConfigs: [[
                    url: 'https://github.com/Vaibhavi1707/calculator.git',
                    credentialsId: '',
                 ]]
                ])
            }
        }
        
        stage('clone') {
            steps {
                git branch: 'main', url: 'https://github.com/Vaibhavi1707/calculator.git'
            }
        }
        
        stage('compile') {
            steps {
                sh'''mvn compile'''
            }
        }
        
        stage('test') {
            steps {
                sh '''mvn test'''
            }
        }
        
        stage('build') {
            steps {
                sh '''mvn package'''
            }
        }
    }
}
