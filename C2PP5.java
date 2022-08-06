import java.util.Scanner;
public class C2PP5 {
  
  public static void main(String[] args){
    Scanner keyScan = new Scanner(System.in);
    
    int bill = 100;
    int change, quarter, dime, nickel;
    
    System.out.println("This program takes a one dollar bill and"
                         + "\ndeduct the price of an item, with that in"
                         + "\nmind, it will then give exact change back.");
    
    System.out.println("\nEnter the price of the item baught.");
    System.out.println("The amount should be no less than 5 and no more than 100");
    System.out.println("The price should work in 5-cent increment [5, 10 , etc]");
                       
    int price = keyScan.nextInt();
    change = bill - price;
    quarter = change / 25;
    change = change % 25;
    dime = change / 10;
    change = change % 10;
    nickel = change / 5;
    change = change % 5;
    
    System.out.println("\nChange: ");
    System.out.println("Quarter(s): " + quarter);
    System.out.println("Dime(s): " + dime);
    System.out.println("Nickle(s): " + nickel);
  }
}