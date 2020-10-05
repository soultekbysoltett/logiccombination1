import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1: Rock | Paper | Scissor | ");
        String playerOne = input.next();
        System.out.println("Player 2: Rock | Paper | Scissor | ");
        String playerTwo = input.next();

        if (playerOne.equals("rock")) {
            if (playerTwo.equals("scissors")) {
                System.out.println("Player 1 Wins");
            } else
        }
    }
}
