import java.util.Scanner;
public class ex_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature conversion");
        System.out.println("Please enter temperature: ");
        double temperature = scanner.nextDouble();
        System.out.println("Please enter 1 for Celsius to Fahrenheit and 2 for Fahrenheit to Celsius");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                double far = (temperature*5/9)+32;
                System.out.println("The temperature from Celsius to Fahrenheit is "+far);
                break;

            case 2:
                double cel = (temperature-32)*5/9;
                System.out.println("The temperature from Fahrenheit to Celsius is "+cel);
                break;
            default:System.out.println("Invalid input!");
        }
        }
    }

