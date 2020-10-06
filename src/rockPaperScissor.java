import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
        combiningConditions();
    }

    public static void combiningConditions () {

            Scanner input = new Scanner(System.in);
            System.out.println("Player 1: Rock | Paper | Scissors ");
            String playerOne = input.next();
            System.out.println("Player 2: Rock | Paper | Scissors ");
            String playerTwo = input.next();

            if ((playerOne.equals("Rock") && playerTwo.equals("Scissors")) || (playerOne.equals("Scissors") &&
                    playerTwo.equals("Paper")) || (playerOne.equals("Paper") && playerTwo.equals("Rock"))) {
                System.out.println("Player 1 Wins");
            } else if ((playerOne.equals("Rock") && playerTwo.equals("Rock")) || (playerOne.equals("Scissors") &&
                    playerTwo.equals("Scissors")) || (playerOne.equals("Paper") && playerTwo.equals("Paper"))) {
                System.out.println("Tie");
            } else {
                System.out.println("Player 2 Wins");
            }

        }

    }
        /*
        if (playerOne.equals("rock")) {
            if (playerTwo.equals("scissors")) {
                System.out.println("Player 1 Wins");
            } else if (playerTwo.equals("paper")) {
                System.out.println("Player 2 Wins");
            } else {
                System.out.println("Tie");
            }
        } else if (playerOne.equals("paper")) {
            if (playerTwo.equals("scissors")) {
                System.out.println("Player 2 Wins");
            } else if (playerTwo.equals("paper")) {
                System.out.println("Tie");
            } else { // playerTwo.equals("rock")
                System.out.println("Player 1 Wins");
            }
        }
    }
}
*/