package Downloads;

public class TypesOfPrimes
{
   public static boolean isSophieGermainPrime(int n) // e.g 2, 23, 89
   { //determines if a number is a Sophie Germaine Prime
       //(a number n such that n and 2 * n + 1 are both prime)
      
       boolean x = TypesOfPrimes.isPrime(n);
       n = (2*n)+1; //
       boolean y = TypesOfPrimes.isPrime(n);
       if(x&&y)
       return true;
       else
       return false;
      
   }
   public static boolean isTwinPrime(int n) //e.g 3,11,17
                   //determines if a number is a Twin Prime
                       //(a number n such that n and n + 2 are both prime)
   {
      
      
       boolean x = TypesOfPrimes.isPrime(n);
       n = n+2;
       boolean y = TypesOfPrimes.isPrime(n);
       if(x&&y)
       return true;
       else
       return false;
      
   }
   //determines if a number is prime and also palindromic (same forward and backwards)
   public static boolean isPalPrime(int n) //e.g 11, 101
   {
       int sum = 0,r=0, temp=n;
       boolean x = TypesOfPrimes.isPrime(n);
       temp=n;
       while(n>0){
           r=n%10; //getting remainder
           sum=(sum*10)+r;
           n=n/10;
           }
       if(temp==sum)
       {
       boolean y = TypesOfPrimes.isPrime(sum);
       if(x&&y)
       return true;
       else
       return false;
       }
       else
           return false;
      
   }
   //determines if the number passed is an emirp (a nonpalindromic prime number whose reverse is also prime)
   public static boolean isEmirp(int n) //e.g. 13
   {
       int sum = 0,r=0,temp=0;
       boolean x = TypesOfPrimes.isPrime(n);
       temp = n;
       while(n>0){
           r=n%10; //getting remainder
           sum=(sum*10)+r;
           n=n/10;
           }
       boolean y = TypesOfPrimes.isPrime(sum);
       if(x&&y)
       return true;
       else
       return false;
      
   }
   //determines if the number passed is a Mersenne Prime (a prime number n such that 2n - 1 is also prime)
   public static boolean isMersenne(int n) //e.g. e.g. 2, 3, 13, 127
   {
       boolean x = TypesOfPrimes.isPrime(n);
       n = 2*n-1;
       boolean y = TypesOfPrimes.isPrime(n);
       if(x&&y)
       return true;
       else
       return false;
      
   }
  
   public static boolean isPrime(int n) // defining another static method to
                                       // check palindrome or not
   {
       int temp;
       boolean isPrime=true;
       for(int i=2;i<=n/2;i++)
       {
   temp=n%i;
       if(temp==0)
       {
       isPrime=false;
       break;
       }
       }
       return isPrime;
      
   }
}


