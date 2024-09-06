public class StarPatternWithLoops {
    public static void main(String[] args) {
        printS();
        printH();
        printU();
        printB();
        printH();
        printA();
        printK();
        printA();
        printN();
        printT();
    }

    static void printS() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || i == 4) {
                    System.out.print("*");
                } else if (i == 1 && j == 0 || i == 3 && j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printH() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || i == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printU() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || i == 4) {
                    if (i == 4 && (j == 0 || j == 4)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printB() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || (i == 0 || i == 2 || i == 4) && j < 4 || j == 4 && (i == 1 || i == 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printA() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((j == 0 || j == 4) && i != 0 || i == 0 && j != 0 && j != 4 || i == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printK() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || i + j == 4 || i - j == 0 && j > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printN() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printT() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

/* Explanation:
printS():

The pattern for 'S' is created using two horizontal lines (i == 0 and i == 2), and two vertical lines at the left and right side (j == 0 and j == 4).
Middle spaces are printed for areas where there’s no *.
printH():

Two vertical lines are created (j == 0 and j == 4).
A horizontal line is added in the middle (i == 2).
printU():

Vertical lines at the start and end (j == 0 and j == 4) for the sides of 'U'.
A bottom horizontal line is created (i == 4), but without the corners (i.e., (j == 0 || j == 4) are skipped).
printB():

A vertical line on the left (j == 0) and curved lines at the top, middle, and bottom (i == 0, i == 2, i == 4).
Right-side lines (j == 4) are drawn for specific rows (i == 1 and i == 3).
printA():

Two vertical lines for the sides (j == 0 and j == 4), except at the top.
A horizontal line at the top (i == 0), and a middle horizontal line (i == 2).
printK():

Left vertical line (j == 0) and diagonal lines (i + j == 4 and i - j == 0) create the pattern for 'K'.
printN():

Two vertical lines for the sides (j == 0 and j == 4) and a diagonal line (i == j) in between.
printT():

A top horizontal line (i == 0) and a vertical line in the center (j == 2).
Key Concepts:
Loops: The outer loop controls the rows, and the inner loop controls the columns.
Conditions: The if statements inside the loops check the current row (i) and column (j) to decide whether to print a star (*) or a space ( ).
Modularity: Each letter's pattern is encapsulated in its own method, making the code more organized and easier to modify or expand.

*/