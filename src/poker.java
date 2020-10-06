import java.util.Scanner;

public class poker {

    public static void main(String[] args) {

        poker();

    }

    // Combining conditions
    public static void poker () {

        Scanner input = new Scanner(System.in);

        System.out.println("Player1's Hand");
        String hand = input.next();

        if (hand.equals("sraight")) {
            if (hand.equals("flush")) {
                System.out.println("straight flush");
            } else {
                System.out.println("straight");
            }
        } else if (hand.equals("flush")) {
            System.out.println("flush");
        }

    }

    // using boolean expressions for simplification
    public static void pokerTwo() {

        Scanner input = new Scanner(System.in);

        System.out.println("Player1's Hand");
        String hand = input.nextLine();

        if (hand.equals("straight && flush")) {
            System.out.println("straight flush");
        } else if (hand.equals("straight")) {
            System.out.println("straight");
        } else if (hand.equals("flush")) {
            System.out.println("flush");
        }

    }

    }
