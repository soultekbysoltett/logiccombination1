import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1: Rock | Paper | Scissor | ");
        String playerOne = input.next();
        System.out.println("Player 2: Rock | Paper | Scissor | ");
        String playerTwo = input.next();

        if ( (playerOne.equals("rock") && playerTwo.equals("scissors")) || (playerOne.equals("scissors") &&
                playerTwo.equals("paper")) || (playerOne.equals("paper") && playerTwo.equals("rock"))) {
            System.out.println("Player 1 Wins");
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