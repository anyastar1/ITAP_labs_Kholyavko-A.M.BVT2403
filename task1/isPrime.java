public class Main {
    
}
import java.util.*;

public class Primes{
    public static void main( String [] args)
    {   
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
        
    }
    public static boolean isPrime(int n)        
    {    
        for ( int i = 2  ; i <= Math.sqrt(n) ; i++)
        { 
            if  (n%i == 0) {
                return false;
            }
               
        }  
        return true;
    }
}
