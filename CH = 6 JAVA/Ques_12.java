public class Ques_12 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
