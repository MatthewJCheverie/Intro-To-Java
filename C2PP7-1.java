import java.util.Scanner;
public class C2PP7 {
  
  public static void main(String[] args){
    
    Scanner keyScan = new Scanner(System.in);
    System.out.println("This program ask the user to supply a radius[inches],"
                         + "\nand depth[feet] to do the sum of how much water a well"
                         + "\nwill have.");
    final double PI = 3.142;
    
    System.out .println("\nEnter the depth of the well [in feet]");
    double depth = keyScan.nextDouble();
    
    System.out.println("\nEnter the radius of the well [inches]");
    double radius = keyScan.nextDouble();
    double inchToFeet = radius / 12;
    
    double volume = PI * (inchToFeet * depth);
    double galloons = volume * 1.87;
    
    System.out.println("\nThe well can hold up to " + galloons + " gallons of water");
  }
}