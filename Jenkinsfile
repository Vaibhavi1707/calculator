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
                    url: 'https://github.com/Vaibhavi1707/calculator',
                    credentialsId: '',
                 ]]
                ])
            }
        }
        
        stage('git clone') {
            steps {
                git branch: 'main', url: 'https://github.com/Vaibhavi1707/calculator.git'
            }
        }
        
        stage('maven compile') {
            steps {
                sh'''mvn compile'''
            }
        }
        
        stage('maven test') {
            steps {
                sh '''mvn test'''
            }
        }
        
        stage('maven build') {
            steps {
                sh '''mvn package'''
            }
        }
        
        stage('docker login') {
            steps {
                sh '''docker login -u $DOCKER_UNAME -p $DOCKER_PASS'''
            }
        }
        
        stage('docker build') {
            steps {
                sh '''docker build -t $DOCKER_UNAME/calculator .'''
            }
        }
        
        stage('docker push image') {
            steps {
                sh '''docker push $DOCKER_UNAME/calculator:latest'''
            }
        }
        
        stage('ansible') {
            steps {
                ansiblePlaybook credentialsId: 'correct-private-key', disableHostKeyChecking: true, installation: 'ansible1', inventory: './ansible/main.inv', playbook: './ansible/main.yml'
            }
        }
    }
    
    post {
        always {
            emailextrecipients([buildUser()])
        }
    }
}


