
import java.util.Scanner;

/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
    2 : - (Subtraction) a - b
    3 : * (Multiplication) a * b
    4 : / (Division) a / b
    5 : % (Modulo or remainder) a % b
    Calculate the result according to the operation given and display it to the user.*/

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number (a): ");

        double a = scanner.nextDouble();

        System.out.println("Enter the second number(b): ");

        double b = scanner.nextDouble();

        // Displaying the operations

        System.out.println("choose an operation:");
        System.out.println("1: +(Addition)");
        System.out.println("2: - (Substraction)");
        System.out.println("3: *(Multiplication)");
        System.out.println("4: / (Divisionon)");
        System.out.println("5: % (Modulo)");

        // Taking operations from the user
        System.out.println("Enter the number corresponding to the operations: ");
        int operation = scanner.nextInt();

        // Variable to store the result

        double result = 0;

        // performing the operation
        switch (operation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {

                    result = a / b;
                } else {
                    System.out.println("Error: division by zero");
                    return;
                }
                break;
            case 5:
                result = a % b;
                break;

            default:
                System.out.println("Invalid operation");
                return;

        }
        // Displaying the result
        System.out.println("The result is: " + result);

    }
}
