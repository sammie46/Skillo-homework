import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle");
        System.out.println("Enter the first angle: ");
        int angleOne = scanner.nextInt();
        System.out.println("Enter the second angle: ");
        int angleTwo = scanner.nextInt();
        System.out.println("Ënter the third angle: ");
        int angleThree = scanner.nextInt();
        int sumAngle=angleOne+angleTwo+angleThree;

        if (sumAngle != 180 || angleOne <= 0 || angleTwo <= 0 || angleThree <= 0) {
            System.out.println("A triangle can't be built with the given angles.");
        }
        else {
            System.out.println("A triangle can be built.");

            if (angleOne == 90 || angleTwo == 90 || angleThree == 90) {
                System.out.println("Type: right-angled");
            }
            else if (angleOne > 90 || angleTwo > 90 || angleThree > 90) {
                System.out.println("Type: obtuse");
            }
            else {
                System.out.println("Type: acute");
            }

            if (angleOne == angleTwo && angleTwo == angleThree) {
                System.out.println("Shape: equilateral");
            }
            else if (angleOne == angleTwo || angleTwo == angleThree || angleOne == angleThree) {
                System.out.println("Shape: isosceles");
            }
            else {
                System.out.println("Shape: multifaceted");
            }
        }


    }
}