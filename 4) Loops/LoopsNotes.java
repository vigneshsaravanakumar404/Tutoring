class LoopsNotes {

    // * Chapter 4 Loops
    public static void main(String[] args) {

        // #######################################
        // Loops General Notes
        // #######################################

        // While Loops
        /*
         * 4.1 While Loops
         * While loops execute a block of code repeatedly as long as a condition is
         * true.
         * Structure: while (condition) { code block }
         * The condition is checked before each iteration.
         * Common usage: Iterating when the number of iterations is not known in
         * advance.
         */

        // Example 1: While loop iteration
        int j = 0;
        while (j < 10) {
            System.out.print(j + " "); // Output: 0 1 2 3 4 5 6 7 8 9
            j++;
        }
        System.out.println("\n\n");

        // Example 2: Do-While loop iteration
        j = 0;
        do {
            System.out.print(j + " "); // Output: 0 1 2 3 4 5 6 7 8 9
            j++;
        } while (j < 10);

        /*
         * 4.2 for Loops
         * For loops are structured loops designed for iterating over a range of values.
         * Structure: for (initialization; condition; iteration) { code block }
         * - Initialization: Initialize loop control variable(s)
         * - Condition: Evaluate whether to continue looping
         * - Iteration: Modify loop control variable(s) to progress iteration
         * The condition is checked before each iteration.
         * Common usage: Processing arrays, iterating a fixed number of times.
         */

        // Example 1: Iterating from 0 to 9
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " "); // Output: 0 1 2 3 4 5 6 7 8 9
        }
        System.out.println("\n\n");

        // Example 2: Iterating from 10 to 1 in reverse
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " "); // Output: 10 9 8 7 6 5 4 3 2 1
        }
        System.out.println("\n\n");

        // Nested Iteration
        /*
         * 4.4 Nested Iteration
         * Nested iteration involves using loops within other loops to perform tasks
         * requiring multiple iterations.
         * Common patterns include printing patterns, processing multi-dimensional
         * arrays.
         */

        // Example 1: Nested loop for printing patterns
        for (int y = 5; y > 0; y--) {
            for (int x = y; x > 0; x--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        /*
         * Output:
         * *****
         * ****
         * ***
         * **
         */

        // Example 2: Nested loop for printing numbers in rows
        for (int y = 5; y > -1; y--) {
            for (int x = y; x > 0; x--) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
        /*
         * Output:
         * 5 4 3 2 1
         * 4 3 2 1
         * 3 2 1
         * 2 1
         * 1
         */

        /*
         * Informal Code Analysis
         * CON 4.5 Informal Code Analysis
         * Analyzing loops involves understanding the flow of control within loops,
         * identifying loop invariants, determining loop termination conditions,
         * and evaluating loop efficiency.
         * Key aspects include understanding the purpose of the loop, identifying
         * loop variables, and analyzing loop termination.
         * Practice analyzing loops for correctness and efficiency.
         */

        // #######################################
        // Things you should be able to do
        // #######################################

        /*
            1.) Expected output of a loop
            2.) Write a loop to iterate over a range of values
            3.) Write a loop to iterate over an array (WE WILL COVER THIS LATER)
            4.) Write a loop to iterate over a 2D array (WE WILL COVER THIS LATER)
            5.) Write a loop to print a pattern (* or numbers)
            6.) How many times a loop will iterate
         */

        // #######################################
        // Common Questions and How to Solve Them
        // #######################################

        
    }
}
