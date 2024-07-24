// to calculate the Cumulative Grade Point Average (CGPA) using the marks of three subjects out of 100

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter marks for three subjects
        System.out.println("Enter the marks for the first subject (out of 100): ");
        double marks1 = scanner.nextDouble();
        
        System.out.println("Enter the marks for the second subject (out of 100): ");
        double marks2 = scanner.nextDouble();
        
        System.out.println("Enter the marks for the third subject (out of 100): ");
        double marks3 = scanner.nextDouble();
        
        // Calculate the average marks
        double averageMarks = (marks1 + marks2 + marks3) / 3.0;
        
        // Calculate CGPA (assuming CGPA is the average marks divided by 10)
        double cgpa = averageMarks / 10.0;
        
        // Display the CGPA
        System.out.println("The CGPA is: " + cgpa);
        
        // Close the scanner
        scanner.close();
    }
}