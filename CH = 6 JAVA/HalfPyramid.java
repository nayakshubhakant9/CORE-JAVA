public class HalfPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the half pyramid

        for (int i = 1; i <= rows; i++) {
            // Print stars for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
