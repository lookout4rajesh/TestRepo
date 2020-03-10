def pilepline_1 = 10-03-2020-function
pipeline{
    agent any
    stages{
        stage("Date")
        {
            steps{
              def dateT = pilepline_1.currentdatetime()
              echo dateT
            }
        }
    }
}
