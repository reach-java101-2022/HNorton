import java.text.NumberFormat;
import java.util.Scanner;

public class LineItemApp {

	public static void main(String args[]) {
		
		System.out.println("Welcome to the Line Item Calculator!");
		System.out.println();

		// Scanner is used to read input from the System.in (console)
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		// keep looping while the user enters y
		while (choice.equalsIgnoreCase("y")) {
			
			// get input from user
			System.out.print("Enter product code: ");
			String productCode = sc.nextLine();

			System.out.print("Enter quantity:     ");
			int quantity = Integer.parseInt(sc.nextLine());
				
			// set product price based on product code
			double price;
			String desc;
			if (productCode.equalsIgnoreCase("java")) {
				price = 57.50;
				desc = "Java Book";
			} else if (productCode.equalsIgnoreCase("jsp")) {
				price = 57.50;
				desc = "JSP Book";
			} else if (productCode.equalsIgnoreCase("mysql")) {
				price = 54.50;
				desc = "MySQL Book";
			} else {
				price = 0;
				desc = "n/a";
			}

			// calculate total
			double total = price * quantity;

			// format and display output
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String priceFormatted = currency.format(price);
			String totalFormatted = currency.format(total);
			String message = "\nLINE ITEM\n" + "Code:        " + productCode 
					+ "\n" + "Price:       " + priceFormatted
					+ "\n" + "Description: " + desc
					+ "\n" + "Quantity:    " + quantity 
					+ "\n" + "Total:       " + totalFormatted + "\n";

			// print it
			System.out.println(message);

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			
			System.out.println();
		}
		// user didn't continue
		sc.close();
		System.out.println("Bye!");
	}
}