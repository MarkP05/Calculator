import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number");
        float num1 = scan.nextInt();

        System.out.println("Please enter the second number");
        float num2 = scan.nextInt();

        System.out.println("Would you like to add or subtract these numbers? Enter 1 for add, or 2 for subtract, 3 for multiply, and 4 for divide.");
        float choice = scan.nextInt();

        float sum = 0;

        if (choice == 1) {
            sum = num1 + num2;
            System.out.println("The sum of the two numbers is: " + sum);
        } else if (choice == 2) {
            sum = num1 - num2;
            System.out.println("The difference of the two numbers is: " + sum);
        } else if (choice == 3) {
            sum = num1*num2;
            System.out.println("The product of the two numbers is: " + sum);
        } else if (choice == 4) {
            if (num2 == 0) {
                System.out.println("Error: Divide by Zero");
            }
            sum = num1/num2;
            System.out.println("The quotient of the two numbers is: " + sum);
        } else {
            System.out.println("Please enter 1 for add, or 2 for subtract, 3 for multiply, and 4 for divide.");
        }

        scan.close();
    }
}