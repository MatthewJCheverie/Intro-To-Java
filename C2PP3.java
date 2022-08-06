import java.util.Scanner;
public class C2PP3 {
  public static void main(String[] args){
    Scanner keyScan = new Scanner(System.in);
    System.out.println("This program will change the first word of a sentence,"
                         + "\nand flip capitalization.");
    
    System.out.print("Enter a sentence.");
    String sentence = keyScan.nextLine();
    
    int space = sentence.indexOf(" ");
    String firstWord = sentence.substring(0, space + 1);
    String removeWord = sentence.replaceFirst(firstWord, " ");
    
    System.out.print(removeWord.substring(1,2).toUpperCase()+ removeWord.substring(2) );
    System.out.print(" ");
    System.out.print(firstWord.substring(0,1).toLowerCase()+ firstWord.substring(1) );
    
  }
}
