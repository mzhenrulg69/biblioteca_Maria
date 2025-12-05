pipeline{
    agent any


    tools{
        jdk 'jdk-21'
        maven 'Maven3.9.11'
    }

    environment{
        VERSION_BACK = "2.0.1"
    }
    
    stages{

        stage('Show messages'){
            steps{
            echo "Primer stage del pipeline"
            }
        }


        stage('Checkout proyecto'){
            steps{
                 git branch:'master',
                    url:'https://github.com/mzhenruñg69/workspace.git'
            }
        }

        stage('comandos maven'){
            steps{
             bat ' mvn clean package'
            }
        }

        stage('Crea un directorio'){
            steps{
                 bat 'mkdir v%VERSION_BACK%'
            }
        }
    }
}
