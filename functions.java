import java.util.*;

public class functions {

	public static int sum(int n1, int n2) {
		int add = n1 + n2;
		return add;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number 1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter Number 2 : ");
		int num2 = sc.nextInt();

		System.out.println("Addition of " + num1 + " and " + num2 + " is : " + sum(num1, num2));

		sc.close();

	}
}
