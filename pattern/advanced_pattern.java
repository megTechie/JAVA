package pattern;

public class advanced_pattern {
    public static void main(String[] args) {
        /*
         * BUTTERFLY PATTERN:-
         * *
         ** **
         *** ***
         ********
         ********
         *** ***
         ** **
         * *
         */

        // int n = 4;
        // // UPPER HALF
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // // LOWER HALF
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /*
            *****
          *****
         ***** 
        *****
         */

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = n - 1; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /*
         * NUMBER PYRAMID
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5
         */

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = n - 1; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        /*
         * PALLINDROM PYRAMID
         * 1
         * 212
         * 32123
         * 4321234
         * 543212345
         */

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = n - 1; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        /*
         * DIAMOND PATTERN
         *
         ***
         *****
         *******
         *******
         *****
         ***
         *
         */

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (2 * i - 1); j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // // lower half
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (2 * i - 1); j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

    }
}