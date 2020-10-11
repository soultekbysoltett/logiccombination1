import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {

        whileLoop();

    }

    public static void daysInMonth() {

        Scanner input = new Scanner(System.in);


        System.out.println("Pick a Month between 1-12 ");
        int x = input.nextInt();

        if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
            System.out.println(31);

        } else if (x == 2) {
            System.out.println(28);

        } else {
            System.out.println(30);

        }

    }

    public static void booOne() {

        boolean x = true;
        boolean y = false;

        if(x && y) {
            System.out.println("a");
        } else if (x || y) {
            System.out.println("b");
        } else if (!x) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }

    }

    public static void forLoop() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

    }

    public static void playGame() {

        Scanner player1 = new Scanner(System.in);
        String playAgain = player1.next();


    }

    public static void whileLoop() {

        Scanner input = new Scanner(System.in);

        String playAgain = "yes";
        while (playAgain.equals("yes")) {
            playGame();
            playAgain = input.next();

        }


    }
}





