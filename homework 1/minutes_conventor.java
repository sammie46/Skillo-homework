import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
     
                System.out.print("Enter minutes: ");
                long minutes = scanner.nextLong();

                long minutesInYear = 525600;
                long minutesInDay = 1440;

                long years = minutes / minutesInYear;
                long remainingMinutes = minutes % minutesInYear;
                long days = remainingMinutes / minutesInDay;

                System.out.println(minutes + " minutes are about " + years + " years and " + days + " days.");

    }
}
