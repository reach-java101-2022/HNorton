package murach.test;

public class CodeTesterApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Code Tester");
        System.out.println();

        // calculate and display a total
        String productCode = "java";
        double price = 49.50;
        int quantity = 2;
        double total = price * quantity;
        String message = 
            "Code:     " + productCode + "\n" +
            "Price:    " + price + "\n" +
            "Quantity: " + quantity + "\n" +
            "Total:    " + total + "\n";
        System.out.println(message);

        // display your name        
        String firstName = "Holly";
        String lastName = "Norton";
        System.out.println("Name: " + lastName + ", " + firstName);
        
        // calculate and display an average        
        double sum = 301.75;
        int count = 6;
        double average = sum / count;
        
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
        
        
        // display a goodbye message
        System.out.println("Bye!");
    }
}
