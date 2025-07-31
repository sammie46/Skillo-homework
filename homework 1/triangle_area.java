import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
    //Without input
        System.out.println("Triangle area");
        float firstSide = 5;
        float secondSide = 6;
        float thirdSide = 8;
        System.out.println("The first side is "+firstSide);
        System.out.println("The second side is "+secondSide);
        System.out.println("The third side is "+thirdSide);
        float perimeter = firstSide+secondSide+thirdSide;
        float halfPerimeter = perimeter/2;
        float area =(float)Math.sqrt(halfPerimeter * (halfPerimeter -firstSide ) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
        System.out.println("The area of the triangle is "+area);

      //With input
      /*  System.out.println("Triangle area");
        System.out.println("Enter the first side: ");
        float firstSide = scanner.nextFloat();
        System.out.println("Enter the second side: ");
        float secondSide = scanner.nextFloat();
        System.out.println("Enter the third side: ");
        float thirdSide = scanner.nextFloat();
        float perimeter = firstSide+secondSide+thirdSide;
        float halfPerimeter = perimeter/2;
        float area =(float)Math.sqrt(halfPerimeter * (halfPerimeter -firstSide ) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
        System.out.println("The area of the triangle is "+area);*/

    }
}
