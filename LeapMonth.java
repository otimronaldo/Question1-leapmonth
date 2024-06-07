import java.util.Scanner;

public class LeapMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year and month
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        // Determine if the given month in the specified year is a leap month
        boolean isLeapMonth = isLeapMonth(year, month);

        // Output the result
        if (isLeapMonth) {
            System.out.println("The month " + month + " in the year " + year + " is a leap month.");
        } else {
            System.out.println("The month " + month + " in the year " + year + " is not a leap month.");
        }
    }

    // Method to check if the given month in the specified year is a leap month
    public static boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);
        return isLeapMonth;
    }
}
