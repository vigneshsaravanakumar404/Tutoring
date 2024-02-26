public class Practice {

    // MC Practice:
    // https://runestone.academy/ns/books/published/csawesome/Unit4-Iteration/Exercises.html

    // FRQ Practice:
    public static void main(String[] args) {

        /* Write the Code */

        // Write a nested loop to produce the following pattern:
        // 54321
        // 4321
        // 321
        // 21
        // 1

        // CODE HERE

        // Write a nested loop to produce the following pattern:
        // *****
        // ****
        // ***
        // **
        // *

        // CODE HERE

        // 1
        // 2 1
        // 3 2 1
        // 4 3 2 1

        // CODE HERE

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4

        /* DTOs */
        for (int y = 1; y <= 4; y++) {
            for (int x = 1; x <= y; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int y = 4; y > 0; y--) {
            for (int x = y; x > 0; x--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int y = 1; y <= 4; y++) {
            for (int x = y; x > 0; x--) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        for (int y = 1; y <= 4; y++) {
            for (int x = 1; x <= y; x++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
