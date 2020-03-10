import java.text.SimpleDateFormat
def currentdatetime() {
   
        def date = new Date()
    sdf = new SimpleDateFormat("MM/dd/yyyy")
    return sdf.format(date)
   
  
}
def output
pipeline{
    agent any
    stages{
        stage("print Date")
        {
            steps{
                script{
                output = currentdatetime()
                echo "Todays's date is ${output}"
                }
            }
        }
    }
}