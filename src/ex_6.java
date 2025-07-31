import java.util.Scanner;
public class ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Leap year");
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is Not a leap year");
        }

    }
}
