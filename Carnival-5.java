import java.util.Random;
public class Carnival {
  
  Random r = new Random();
  
  public static void main(String[] args) {
    
    Carnival d = new Carnival();
    int playerRolls[] = {6,20,8,4,12};
    int numberOfWins = 0;
    
    for(int n=1;n<=100;n++) {
      
      int sum = 0;
    
    for(int r=0;r<playerRolls.length;r++) {
      sum+=d.dieRoll(playerRolls[r]);
    }
    
    if(sum<20 || sum>35) {
      numberOfWins++;
    }
    }
    System.out.println("The number of times a player has won is: "+numberOfWins);
  }
  public int dieRoll(int x) {
    return r.nextInt(x)+1;
  }
}