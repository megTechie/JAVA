
// import java.util.Scanner;
import java.util.*;

public class basic_prog {
    public static void main(String[] args) {

        // ADDITION OF TWO NUMBERS
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 :");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("Addition is: ");
        System.out.println(sum);
        sc.close();

        // CONDITIONAL STATEMENTS(if, else, else if, switch, break)
        // if, else

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }
        sc.close();

        // else if
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        sc.close();
        if (a == b)
            System.out.println("Both a and b are equal");
        else if (a > b)
            System.out.println("a is greater than b");
        else
            System.out.println("b is greater than a");

        // Switch
        // 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Button : ");
        char button = sc.next().charAt(0);
        sc.close();
        switch (button) {
            case A:
                System.out.println("Hello");
                break;
            case B:
                System.out.println("Namaste");
                break;
            case C:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("Invalid Button Number");
        }

        // 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Button : ");
        String button = sc.nextLine();
        sc.close();
        switch (button) {
            case "A":
                System.out.println("Hello");
                break;
            case "B":
                System.out.println("Namaste");
                break;
            case "C":
                System.out.println("bonjour");
                break;
            default:
                System.out.println("Invalid Button Number");
        }

        // SUM OF N NATURAL NUMBERS
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        // FACTORIAL
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        sc.close();
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        // TABLE OF N
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        sc.close();
        int table;
        for (int i = 1; i <= 10; i++) {
            table = n * i;
            System.out.println(table);
        }

        // count of +ve, -ve and zeros.
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        String choice;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number : ");
            int num = sc.nextInt();

            if (num == 0) {
                zeros++;
            } else if (num > 0) {
                positive++;
            } else {
                negative++;
            }
            // System.out.print("Enter your choice(yes/no) : ");
            // String choice = sc.nextLine();

            sc.nextLine(); // Consume the leftover newline from nextInt()
            System.out.println("Enter your choice (yes/no) : ");
            choice = sc.nextLine().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("POSITIVE : " + positive);
        System.out.println("NEGATIVE : " + negative);
        System.out.println("ZEROS : " + zeros);
        sc.close();

        // EXPONENTIAL
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base : ");
        float base = sc.nextFloat();
        System.out.print("Enter Power : ");
        float power = sc.nextFloat();
        double result = Math.pow(base, power);
        System.out.println(base + " to the power " + power + " is : " + result);

        // find GDC or HCF
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number : ");
        n1 = sc.nextInt();

        System.out.print("Enter second Number : ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            for (int i = n2; i >= 2; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    System.out.println("GCD Or HCF of " + n1 + " and " + n2 + " is : " + i);
                    break;
                }
            }
        } else if (n2 > n1) {
            for (int i = n1; i >= 2; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    System.out.println("GCD Or HCF of " + n1 + " and " + n2 + " is : " + i);
                    break;
                }
            }
        } else {
            System.out.println(n1);
        }
        sc.close();

        // Fibonacci Series
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nth term : ");
        n = sc.nextInt();

        int first = 0;
        int sec = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + sec;
            first = sec;
            sec = next;
        }
        sc.close();

        // Prime number
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }

        sc.close();

        // Print prime number range btw 1-n

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range :");
        int low = sc.nextInt();

        System.out.print("Enter higher range :");
        int high = sc.nextInt();
        for (int i = low; i <= high; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

        sc.close();

        // Count number of digits in a number
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        sc.close();

    }
}
