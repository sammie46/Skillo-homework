import java.util.Scanner;
public class ex_5 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Vacation");
      System.out.println("Choose number for the type of vacation: ");
      System.out.println("1.Beach | 2.Mountain");
      int number = scanner.nextInt();
      System.out.println("Enter budget per day per person: ");
      double budgetPerDay = scanner.nextDouble();

      if(number==1) {
          System.out.println("You chose Beach");
          if(budgetPerDay<=50)
          {
              System.out.println("Advised destination: Bulgaria");
          }
          else {
              System.out.println("Advised destination: Outside Bulgaria");
          }
          }

      else if (number==2) {
          System.out.println("You chose Mountain");
          if(budgetPerDay<=30)
          {
              System.out.println("Advised destination: Bulgaria");
          }
          else {
              System.out.println("Advised destination: Outside Bulgaria");
          }
      }

      else {
          System.out.println("There is no information about this type of vacation.");
      }



      }
    }

