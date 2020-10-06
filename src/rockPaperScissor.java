import java.util.Scanner;

public class rockPaperScissor {

    public static void main(String[] args) {

        combiningConditions1();
    }

    public static void combiningConditions1 () {

        Scanner input = new Scanner(System.in);
        System.out.println("Player 1: Rock | Paper | Scissors ");
        String playerOne = input.next();
        System.out.println("Player 2: Rock | Paper | Scissors ");
        String playerTwo = input.next();

        // Rock, Paper, Scissors using Operators through combining Boolean Expressions.
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

    public static void combiningConditions2 () {

        // (Rock, Paper, Scissor using nested if statements)
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1: Rock | Paper | Scissors ");
        String playerOne = input.next();
        System.out.println("Player 2: Rock | Paper | Scissors ");
        String playerTwo = input.next();

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




    d}
}
