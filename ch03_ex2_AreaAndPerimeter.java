package murach.fv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome folks it's a Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            // get input from user
            System.out.print("Enter lenght:   ");
            double lenght = Double.parseDouble(sc.nextLine());

            System.out.print("Enter width: ");
            Double.parseDouble(sc.nextLine());

            System.out.print("Enter area:      ");
            Integer.parseInt(sc.nextLine());
            System.out.print("Enter perimeter");
            Integer.parseInt(sc.nextLine ());
            
            // convert length * width into area perimeter
            double width1 = lenght ; 
            int perimeter1 = (int) (2 * width1 + 2 * lenght);
            // calculate the future value
            double futureValue = 0;
            int i = 1;
            while (i <= perimeter1) {
                futureValue = futureValue + lenght;            
                i = i + 1;
            }            

            // format and display the result
            System.out.println();

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("see ya later!");
    }
}