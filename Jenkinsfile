pipeline {
    agent any
    
    tools {
        // Allure Commandline'ı kullanmak için burada tanımlayın
        allure 'Allure Commandline'  // Jenkins'te yapılandırdığınız Allure versiyonunun adı
    }

    stages {
        stage('Checkout') {
            steps {
                // Repository'den kodu çekmek
                git 'https://your-repository-url.git'
            }
        }
        
        stage('Install Dependencies') {
            steps {
                script {
                    // Gerekli bağımlılıkları yüklemek (örneğin, Maven)
                    sh 'mvn clean install -DskipTests'
                }
            }
        }
        
        stage('Run Tests') {
            steps {
                script {
                    // Testleri çalıştırmak ve Allure sonuçlarını oluşturmak
                    sh 'mvn test'
                }
            }
        }

        stage('Allure Report') {
            steps {
                script {
                    // Allure raporunu oluşturmak
                    allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
                }
            }
        }
    }

    post {
        always {
            // Build sonrasında yapılacak işlemler (temizlik vs.)
            cleanWs()
        }
    }
}
