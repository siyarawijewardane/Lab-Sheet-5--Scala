object FindingPrime{

    def gcd(num1 : Int , num2 : Int) : Int= (num1 , num2) match {

        case (num1 ,num2) if num1 > num2 => num2 match {
            case 0  => num1
            case _ => gcd(num2 , num1 %num2)

        }

        case (num1 ,num2) if num2 > num1 => num1 match {
            case 0 => num2
            case _ => gcd(num1 , num2 % num1) 

        }
    
    }

    def prime(number :  Int , divisor : Int = 2) : Boolean = divisor match{

        case x if number < 2  => false
        
        case x if x == number => true

        case x if gcd(number , x ) > 1 => false
        
        case x => prime(number , x + 1)
    }


    def main(args: Array[String]): Unit = {

         print(prime(1))
        
    }
}