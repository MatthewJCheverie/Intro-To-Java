import java.util.Scanner;
public class C4PP7 {
  public static void main(String[] args){
    
    double time = 0, height = 0, bounce = 1;
    boolean ball = true;
    Scanner keyScan = new Scanner(System.in); 
    
    System.out.println("This program will simulate the bouce"
                         + "\nof a ball."
                         + "\n Enter the initial velocity of the ball");
    int velocity = keyScan.nextInt();
    
    do{
      System.out.println("Time: " + time++ + " Height: " + height);
      height += velocity;
      velocity -= 32;
      
      if(height <= 0){
        System.out.println("Bounce!");
        
        height *= -0.5;
        velocity *= -0.5;
        bounce++;
      }
      
      if(bounce == 6){
        break;
      }
    }while(ball);
  }
}