Pipeline {

    agent any

    stages{

        stage('Git Checkout'){

           steps{
                git branch: 'main', url: 'https://github.com/manoj9885762348/CI-Demo_part-1.git'
            }
        }    
    }
}
