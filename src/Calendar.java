import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {

        daysInMonth();

    }

    public static void daysInMonth() {

        Scanner input = new Scanner(System.in);


        System.out.println("Pick a Month between 1-12 ");
        int month = input.nextInt();

        if (month <= 0 || month >= 13) {
            System.out.println("Invalid Month");

        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("There are 31 days in this month.");

        } else if (month == 2) {
            System.out.println("There are 28 days in this month.");

        } else {
            System.out.println("There are 30 days in this month.");

        }


    }
}

