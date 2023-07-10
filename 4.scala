object NumberProcessing{

    def isOdd(number : Int) : Boolean = {
        if (number == 0){
            false
        }
        else{
            isEven(number - 1)
        }
    }

    def isEven(number : Int) : Boolean = {  boolean actually prints true or false on to the console.
        if(number == 0){                    Always use meaningful method names
            true
        }
        else{
            isOdd(number-1)
        }
    }

    def main(args: Array[String]): Unit = {
        
        val result = isEven(5)
        print(result)
    }
}