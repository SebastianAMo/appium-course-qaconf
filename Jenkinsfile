pipeline {
    agent any
    environment {
        APPIUM_HOST = "host.docker.internal"
        ADB_HOST = "host.docker.internal"
    }
    stages {
        stage('Set up project') {
            steps {
                echo "Coping project to workspace"
                sh '''
                    mkdir -p mobile-appium-automation-serenitybdd
                    rsync -av --exclude='.git' /opt/mobile-appium-automation-serenitybdd/ mobile-appium-automation-serenitybdd/
                '''
                echo "Project in workspace: ${env.WORKSPACE}"
                echo "Deleting CR in gradlew..."
                sh 'sed -i "s/\r//" mobile-appium-automation-serenitybdd/gradlew'
            }
        }
        stage('Build and Test') {
            steps {
                dir('mobile-appium-automation-serenitybdd') {
                    sh '''
                    pwd
                    ls -al
                    ./gradlew clean test -Denvironment=moto72 aggregate reports
                    '''
                }
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/site/serenity/**', allowEmptyArchive: true
            publishHTML ([
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'mobile-appium-automation-serenitybdd/target/site/serenity',
                reportFiles: 'index.html, serenity-summary.html',
                reportName: 'Reporte Serenity'
            ])
        }
    }
}