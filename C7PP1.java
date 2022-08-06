import java.util.Scanner;
public class C7PP1
{
   public static void main(String[] args)
   {      
       Scanner scan = new Scanner(System.in);      
       scan.useDelimiter(".");
      
       System.out.println("Please enter a sentence that ends in a period(.) : ");
       String text=scan.nextLine();
       int[] alphabets=new int[26];
       char character;
      
       for (int i = 0; i < text.length(); i++)
       {
           character=Character.toLowerCase(text.charAt(i));
           if(!(character==' ') && !(character=='.'))
           alphabets[(int)character-(int)'a']++;
       }
      
       int index=0;
       System.out.printf("%-5s%-5s\n",
               "Letter","Count");
       for (char letter = 'a'; letter<='z'; letter++,index++)
       {
           System.out.printf("[%c] = %-10d\n",letter,alphabets[index]);
       }
   scan.close();
   }
}