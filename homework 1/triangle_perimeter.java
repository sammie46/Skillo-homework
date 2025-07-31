import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

      //Without input
        System.out.println("Triangle perimeter");
        float firstSide = 5;
        float secondSide = 6;
        float thirdSide = 8;
        System.out.println("The first side is "+firstSide);
        System.out.println("The second side is "+secondSide);
        System.out.println("The third side: "+thirdSide);
        float perimeter = firstSide+secondSide+thirdSide;
        System.out.println("The perimeter of the triangle is: "+perimeter);  
     
     //With input 
      /* System.out.println("Triangle perimeter");
        System.out.println("Enter the first side: ");
        float firstSide = scanner.nextFloat();
        System.out.println("Enter the second side: ");
        float secondSide = scanner.nextFloat();
        System.out.println("Enter the third side: ");
        float thirdSide = scanner.nextFloat();
        float perimeter = firstSide+secondSide+thirdSide;
        System.out.println("The perimeter of the triangle is: "+perimeter);
*/

