import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 //Without input
        String firstName ="Betty";
        String midName ="Netty";
        String surname ="Ketty";
        System.out.println("Your first name is "+firstName);
        System.out.println("Your middle name is "+midName);
        System.out.println("Your surname: "+surname);
        System.out.println("Your full name is "+firstName+ midName+ surname);
   
  //With input
      /*    System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your middle name: ");
        String midName = scanner.nextLine();
        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.println("Your full name is: "+firstName+midName+surname);
*/
    }
}
