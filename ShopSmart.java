import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = 'R';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        // Adjust pluralization
        String pluralItem = (quantity > 1) ? item + "s" : item;

        System.out.println("\nYou have bought " + quantity + " " + pluralItem + ".");
        System.out.println("Your total is " + currency + total);
    }
}
