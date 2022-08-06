import java.util.Scanner;

public class Rock {
  public static void main(String[] args) {
    String personPlay;
    String computerPlay;
    int computerInt;
    int computerWins = 0;
    int playerWins = 0;
  
    Scanner scan = new Scanner(System.in);
  
    System.out.println("You will be playing a game of rock, paper, scissors, lizzards and spock against the computer.");
      System.out.println("Enter your play: R, P, S, L, or K:");
      personPlay = scan.next();

      if (personPlay.equals("r") || personPlay.equals("p") || personPlay.equals("s") || personPlay.equals("l") || personPlay.equals("k")) {
        if (personPlay.equals("r")) {
          personPlay = "R";
        } else if (personPlay.equals("p")) {
          personPlay = "P";
        } else if (personPlay.equals("s")) {
          personPlay = "S";
        } else if (personPlay.equals("l")) {
          personPlay = "L";
        } else {
          personPlay = "K";
        }
      }
    
      while (!personPlay.equals("R") && !personPlay.equals("P") && !personPlay.equals("S") && !personPlay.equals("L") && !personPlay.equals("K")) {
        System.out.println("You entered an invalid character!");
        System.out.println("Please enter a valid play: R, P, S, L, or K:");
        personPlay = scan.next();
        if (personPlay.equals("r") || personPlay.equals("p") || personPlay.equals("s") || personPlay.equals("l") || personPlay.equals("k")) {
          if (personPlay.equals("r")) {
            personPlay = "R";
          } else if (personPlay.equals("p")) {
            personPlay = "P";
          } else if (personPlay.equals("s")) {
            personPlay = "S";
          } else if (personPlay.equals("l")) {
            personPlay = "L";
          } else {
            personPlay = "K";
          }
        }
      }
    
      computerInt = (int) (Math.random() * 5);

      if (computerInt == 0) {
        computerPlay = "R";
      } else if (computerInt == 1) {
        computerPlay = "P";
      } else if (computerInt == 2) {
        computerPlay = "S";
      } else if (computerInt == 3) {
        computerPlay = "L";
      } else {
        computerPlay = "K";
      }

      System.out.println("The computer plays " + computerPlay + "!");

      if (personPlay.equals(computerPlay)) {
        System.out.println("It's a tie! Try again.");
      } else if (personPlay.equals("R")) {
        if (computerPlay.equals("P")) {
          System.out.println("Paper covers rock. You lose!");
          computerWins++;
        } else if (computerPlay.equals("S")) {
          System.out.println("Rock crushes scissors. You win!");
          playerWins++;
        } else if (computerPlay.equals("L")) {
          System.out.println("Rock crushes lizard. You win!");
          playerWins++;
        } else {
          System.out.println("Spock vaporizes rock. You lose!");
          computerWins++;
          
        }
      } else if (personPlay.equals("P")) {
        if (computerPlay.equals("R")) {
          System.out.println("Paper covers rock. You win!");
          playerWins++;
        } else if (computerPlay.equals("S")) {
          System.out.println("Scissors cut paper. You lose!");
          computerWins++;
        } else if (computerPlay.equals("L")) {
          System.out.println("Lizard eats paper. You lose!");
          computerWins++;
        } else {
          System.out.println("Paper disproves Spock. You win!");
          playerWins++;
          
        }
      } else if (personPlay.equals("S")) {
        if (computerPlay.equals("R")) {
          System.out.println("Rock crushes scissors. You lose!");
          computerWins++;
        } else if (computerPlay.equals("P")) {
          System.out.println("Scissors cut paper. You win!");
          playerWins++;
        } else if (computerPlay.equals("L")) {
          System.out.println("Scissors decapitates lizard. You win!");
          playerWins++;
        } else {
          System.out.println("Spock smashes scissors. You lose!");
          computerWins++;
          
        }
      } else if (personPlay.equals("L")) {
        if (computerPlay.equals("R")) {
          System.out.println("Rock crushes lizard. You lose!");
          computerWins++;
        } else if (computerPlay.equals("P")) {
          System.out.println("Lizard eats paper. You win!");
          playerWins++;
        } else if (computerPlay.equals("S")) {
          System.out.println("Scissors decapitates lizard. You lose!");
          computerWins++;
        } else {
          System.out.println("Lizard poisons Spock. You win!");
          playerWins++;
       
        }
      } else {
        if (computerPlay.equals("R")) {
          System.out.println("Spock vaporizes rock. You win!");
          playerWins++;
        } else if (computerPlay.equals("P")) {
          System.out.println("Paper disproves Spock. You lose!");
          computerWins++;
        } else if (computerPlay.equals("S")) {
          System.out.println("Spock smashes scissors. You win!");
          playerWins++;
        } else {
          System.out.println("Lizard poisons Spock. You lose!");
          computerWins++;
          
        }
      }
   
  
    if (playerWins > computerWins) {
      System.out.println("The winner is you.");
    } else {
      System.out.println("The winner is the computer.");
    }
}
}

