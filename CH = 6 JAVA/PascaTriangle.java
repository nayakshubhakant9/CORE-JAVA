public class PascaTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in Pascal's Triangle

        for (int i = 0; i < rows; i++) {
            // Print leading spaces to format the triangle
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
