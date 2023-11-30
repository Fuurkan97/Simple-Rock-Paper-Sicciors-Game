import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int compWinCount = 0;
        int playerWinCount = 0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] game = {"rock", "siccors", "paper"};
        System.out.println("Welcome to the Rock-Paper-Siccor GAME ");
        do {
            System.out.println("Please chose your move");
            String playerChoice = sc.nextLine();
            int computerMove = random.nextInt(3);
            String computerChoice = game[computerMove];


            if (playerChoice.equals(computerChoice)) {
                System.out.println("DRAW");
            } else if (playerChoice.equalsIgnoreCase("Rock") & computerChoice.equals("Siccors")) {
                System.out.println("Player wins");
                playerWinCount++;
            } else if (playerChoice.equalsIgnoreCase("Siccors") & computerChoice.equals("paper")) {
                System.out.println("Player wins");
                playerWinCount++;
            } else if (playerChoice.equalsIgnoreCase("Paper") & computerChoice.equals("rock")) {
                System.out.println("Player wins");
                playerWinCount++;
            } else {
                System.out.println("Computer wins");
                compWinCount++;
            }
        }while (compWinCount <3 && playerWinCount <3);

        if(playerWinCount == 3){
            System.out.println("Congratz YOU WON !");
        }
        else{
            System.out.println("You LOSE ");
        }

    }
}





