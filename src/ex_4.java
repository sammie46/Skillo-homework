import java.util.Scanner;
public class ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Discount");
        System.out.print("Enter the unit price:");
        double price  = scanner.nextDouble();
        System.out.println("Enter the qantity: ");
        int quantity = scanner.nextInt();
        double totalPrice = price*quantity;

        if(quantity>=100 && quantity<=120){
            double discount = totalPrice*0.15;
            double revenueSale = totalPrice-discount;
            System.out.println("The revenue from sale: "+revenueSale);
            System.out.println("Discount: "+discount);
        }

        else if(quantity>120) {
            double discount = totalPrice * 0.20;
            double revenueSale = totalPrice-discount;
            System.out.println("The revenue from sale: "+revenueSale);
            System.out.println("Discount: "+discount);
        }

        else{
            System.out.println("There is no discount");
            System.out.println("The total price is: "+totalPrice);
        }

    }
}
