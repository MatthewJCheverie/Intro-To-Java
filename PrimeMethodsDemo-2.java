package Downloads;
import java.util.Scanner;

import Downloads.TypesOfPrimes;//first code
public class PrimeMethodsDemo {

   public static void main(String[] args)
   { 
     int n;//number
   boolean p;//prime
       Scanner userInput = new Scanner(System.in); 
       System.out.println("Enter a Number"); 
       n = userInput.nextInt();
p = TypesOfPrimes.isSophieGermainPrime(n);
System.out.println("SophieGermainPrime "+p);
p = TypesOfPrimes.isTwinPrime(n);
System.out.println("TwinPrime "+p);
p = TypesOfPrimes.isPalPrime(n);
System.out.println("Palindromic Prime "+p);
p = TypesOfPrimes.isEmirp(n);
System.out.println("Nonpalindromic Prime "+p);
p = TypesOfPrimes.isMersenne(n);
System.out.println("Mersenne Prime "+p);
   }

}