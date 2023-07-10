object Fibonacci{

    def fibonacci(n : Int) : Int ={
        if (n <= 1){
            n
        }
        else{

            fibonacci(n-1) + fibonacci(n-2)
        }
    }

    def printFibonacci(n : Int) : Unit = {   //if the return is a print or we are not reurning anything it is always Unit
        
        if(n >= 0){
            
            print(fibonacci(n) + " ")
            printFibonacci(n-1)
        }
    }

    def decreasing(n : Int) : Unit = {
        val m = n - 1
        printFibonacci(m)
    }

        
    def main(args: Array[String]): Unit = {
            
        decreasing(5)

    }
    
}