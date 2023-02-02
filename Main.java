package murach.rectangle;

import java.util.Scanner;
import murach.rectangle.Rectangle;

public class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter length: ");
            double length = Double.parseDouble(sc.nextLine());

            System.out.print("Enter width:  ");
            double width = Double.parseDouble(sc.nextLine());

            // create the Rectangle object
            Rectangle r = new Rectangle(length, width);
            
            // format and display output
            String message = 
                "Area:         " + r.getAreaNumberFormat() + "\n" +
                "Perimeter:    " + r.getPerimeterNumberFormat() + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("Bye!");
    }
}