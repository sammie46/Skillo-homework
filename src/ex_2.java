import java.util.Scanner;
public class ex_2 {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Day of the week");
System.out.println("Please enter a number from 1 to 7: ");
int number=scanner.nextInt();
switch(number) {
    case 1:
        System.out.println("The "+number+"-st/nd/rd/th day of the week is Monday");
        break;
    case 2:
        System.out.println("The "+number+"-st/nd/rd/th day of the week is Tuesday");
        break;
    case 3:
        System.out.println("The "+number+"-st/nd/rd/th day of the week is Wednesday");
        break;
    case 4:
        System.out.println("The "+number+"-st/nd/rd/th day of the week is Thursday");
        break;
    case 5:
        System.out.println("The "+number+"-st/nd/rd/th day of the week is Friday");
        break;
    case 6:
        System.out.println("The "+number+"-st/nd/rd/th day of the week is Saturday");
        break;
    case 7:
        System.out.println("The "+number+"-st/nd/rd/th day of the week is Sunday");
        break;

    default:System.out.println("Invalid input!");
}
}
    }
