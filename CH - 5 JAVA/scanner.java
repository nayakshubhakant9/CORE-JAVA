import java.util.Scanner;

// Print rectangle star patterns 
// Println means print in next line and if only print is written print in the same line
// Rows - outer loops
// Columns - inner loops

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Correctly capitalize Scanner

        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int m = scanner.nextInt();

        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close(); // Close the scanner
    }
}