import java.util.*;

public class prac {

	public static void main(String[] args) {
		// GRADING
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter your marks : ");
		// int marks = sc.nextInt();

		// if (marks > 100 || marks < 0) {
		// System.out.println("Invalid Marks, Please enter valid marks!!!");
		// } else if (marks > 90) {
		// System.out.println("Excellent");
		// } else if (marks > 80 && marks <= 90) {
		// System.out.println("Good");
		// } else if (marks > 70 && marks <= 80) {
		// System.out.println("Fair");
		// } else if (marks > 60 && marks <= 70) {
		// System.out.println("Meets expectations");
		// } else {
		// System.out.println("Below par");
		// }
		// sc.close();

		// display number :
		// Scanner sc = new Scanner(System.in);

		// System.out.print("Enter number : ");
		// int num = sc.nextInt();

		// String str = String.valueOf(num);

		// for (int i = 0; i < str.length(); i++) {
		// System.out.println(str.charAt(i));
		// }

		// sc.close();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		int count = 0;
		if (num == 0) {
			count++;
		} else {
			while (num != 0) {
				num = num / 10;
				count++;
			}
		}
		System.out.print("Number of digits is : " + count);
		sc.close();

	}
}
