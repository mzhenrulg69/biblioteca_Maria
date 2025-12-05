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
                    url:'https://github.com/mzhenrulg69/biblioteca_Maria.git'
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

        stage('copiar fichero'){
            steps{
                bat 'xcopy /Y ".\\target\\*.jar" ".\\v%VERSION_BACK%" '
            }

            post{
                success{
                    bat 'echo "Despues de copiar los ficheros correctamente"'
                }
                failure{
                    bat ' echo "Error copiando los ficheros"'
                }
                always{
                    bat ' echo "Se ejecutan siempre tras el stage Copiar ficheros"'
                }
            }
        }
    }
}
