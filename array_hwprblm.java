import java.util.Scanner;

public class array_hwprblm {
	public static void main(String[] args) {
		// LEC-3

		// Q - 1 Calculator
		// Scanner sc = new Scanner(System.in);

		// System.out.println("Enter number 1 : ");
		// int num1 = sc.nextInt();

		// System.out.println("Enter number 2 : ");
		// int num2 = sc.nextInt();

		// System.out.println("Enter opertor (+, -, *, /, %): ");
		// char operator = sc.next().charAt(0);

		// switch (operator) {
		// case '+':
		// System.out.println("Addition : " + (num1 + num2));
		// break;

		// case '-':
		// System.out.println("Difference : " + (num1 - num2));
		// break;

		// case '*':
		// System.out.println("Multiplication : " + (num1 * num2));
		// break;

		// case '/':
		// System.out.println("Division : " + (num1 / num2));
		// break;

		// case '%':
		// System.out.println("Remainder : " + (num1 % num2));
		// break;

		// default:
		// System.out.println("Enter valid operator!!!");
		// }

		// Q - 2
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter number between(1-12) : ");
		// int num = sc.nextInt();

		// switch (num) {
		// case 1:
		// System.out.println("January");
		// break;

		// case 2:
		// System.out.println("February");
		// break;

		// case 3:
		// System.out.println("March");
		// break;

		// case 4:
		// System.out.println("April");
		// break;

		// case 5:
		// System.out.println("May");
		// break;

		// case 6:
		// System.out.println("June");
		// break;

		// case 7:
		// System.out.println("July");
		// break;

		// case 8:
		// System.out.println("August");
		// break;

		// case 9:
		// System.out.println("September");
		// break;

		// case 10:
		// System.out.println("October");
		// break;

		// case 11:
		// System.out.println("November");
		// break;

		// case 12:
		// System.out.println("December");
		// break;

		// default:
		// System.out.println("enter number between 1 to 12 only!!!");
		// }

		// ARRAY HW
		// Q-1 : Take an array of names as input from the user and print them on the
		// screen.

		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter the size of the array : ");
		// int size = sc.nextInt();
		// sc.nextLine(); // read extra line

		// String names[] = new String[size];

		// System.out.println("Enter names : ");
		// for (int i = 0; i < size; i++) {
		// names[i] = sc.nextLine();
		// }
		// for (int i = 0; i < size; i++) {
		// System.out.println(names[i]);
		// }
		// sc.close();

		// Q - 2 : Find the maximum & minimum number in an array of integers.
		// Scanner sc = new Scanner(System.in);

		// System.out.print("Enter size : ");
		// int size = sc.nextInt();
		// int MinMax[] = new int[size];

		// System.out.println("Enter elements : ");
		// for (int i = 0; i < size; i++) {
		// MinMax[i] = sc.nextInt();
		// }

		// int max = MinMax[0];
		// int min = MinMax[0];
		// for (int i = 1; i < size; i++) {
		// if (MinMax[i] > max) {
		// max = MinMax[i];
		// }
		// if (MinMax[i] < max) {
		// min = MinMax[i];
		// }
		// }
		// System.out.println("Largest number is : " + max);
		// System.out.println("Smallest number is : " + min);

		// OR

		// Scanner sc = new Scanner(System.in);

		// System.out.print("Enter size : ");
		// int size = sc.nextInt();
		// int MinMax[] = new int[size];

		// System.out.println("Enter elements : ");
		// for (int i = 0; i < size; i++) {
		// MinMax[i] = sc.nextInt();
		// }

		// int max = Integer.MIN_VALUE;
		// int min = Integer.MAX_VALUE;

		// for (int i = 0; i < size; i++) {
		// if (MinMax[i] < min) {
		// min = MinMax[i];
		// }
		// if (MinMax[i] > max) {
		// max = MinMax[i];
		// }
		// }
		// System.out.println("Largest number is : " + max);
		// System.out.println("Smallest number is : " + min);

		// Q - 3 : Take an array of numbers as input and check if it is an array sorted
		// in ascending order.

		int arr[] = { 1, 2, 5, 9, 13 };
		System.out.println(isSorted(arr));

	}

	public static boolean isSorted(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;
	}
}
