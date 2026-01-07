import java.util.*;

public class array {
	public static void main(String[] args) {
		// // 1-D Array TRAVERSING

		// Scanner sc = new Scanner(System.in);

		// System.out.print("Enter size : ");
		// int size = sc.nextInt();

		// int arr1[] = new int[size];

		// System.out.println("Enter elements : ");
		// for (int i = 0; i < size; i++) {
		// arr1[i] = sc.nextInt();
		// }

		// for (int i = 0; i < size; i++) {
		// System.out.println("Element at [" + i + "]index : " + arr1[i]);
		// }

		// sc.close();

		// 1-D Array SEARCHING
		// Scanner sc = new Scanner(System.in);

		// boolean found = false;

		// System.out.print("Enter Element which you want to search : ");
		// int ele = sc.nextInt();

		// int arr1[] = { 1, 2, 3, 4, 6, 6 };
		// for (int i = 0; i < 6; i++) {
		// if (arr1[i] == ele) {
		// System.out.println("Element found at [" + i + "] index");
		// found = true;
		// }
		// }
		// if (!found) {
		// System.out.println(ele + " not found !!! ");
		// }
		// sc.close();

		// 2-D TRAVERSING
		// Scanner sc = new Scanner(System.in);

		// System.out.print("Enter number of rows : ");
		// int rows = sc.nextInt();

		// System.out.print("Enter number of columns : ");
		// int cols = sc.nextInt();

		// int matrix[][] = new int[rows][cols];

		// System.out.println("Enter elements : ");
		// for (int i = 0; i < rows; i++) {
		// for (int j = 0; j < cols; j++) {
		// System.out.print("Element at [" + i + "][" + j + "] : ");
		// matrix[i][j] = sc.nextInt();
		// }
		// }
		// System.out.println();
		// for (int i = 0; i < rows; i++) {
		// for (int j = 0; j < cols; j++) {
		// // System.out.println("Element at [" + i + "][" + j + "] : " + matrix[i][j]);
		// System.out.print(matrix[i][j] + " ");
		// }
		// System.out.println();
		// }
		// sc.close();

		// 2-D Array SEARCHING
		// Scanner sc = new Scanner(System.in);

		// boolean found = false;

		// System.out.print("Enter number of rows : ");
		// int rows = sc.nextInt();

		// System.out.print("Enter number of columns : ");
		// int cols = sc.nextInt();

		// int matrix[][] = new int[rows][cols];
		// for (int i = 0; i < rows; i++) {
		// for (int j = 0; j < cols; j++) {
		// System.out.print(" Enter Element at [" + i + "][" + j + "] : ");
		// matrix[i][j] = sc.nextInt();
		// }
		// }

		// System.out.print("Enter elements you want to search : ");
		// int ele = sc.nextInt();

		// for (int i = 0; i < rows; i++) {
		// for (int j = 0; j < cols; j++) {
		// if (matrix[i][j] == ele) {
		// System.out.println(ele + " found at [" + i + "][" + j + "] index ");
		// found = true;
		// }
		// }
		// }
		// if (!found) {
		// System.out.println(ele + " not found in the matrix.");
		// }

		// sc.close();

		// TRANSPOSE OF MATRIX
		// Scanner sc = new Scanner(System.in);

		// System.out.print("Enter number of rows : ");
		// int rows = sc.nextInt();

		// System.out.print("Enter number of columns : ");
		// int cols = sc.nextInt();

		// int matrix[][] = new int[rows][cols];

		// System.out.println("Enter elements : ");
		// for (int i = 0; i < rows; i++) {
		// for (int j = 0; j < cols; j++) {
		// System.out.print("Element at [" + i + "][" + j + "] : ");
		// matrix[i][j] = sc.nextInt();
		// }
		// }
		// System.out.println("ORIGINAL MATRIX :- ");
		// for (int i = 0; i < rows; i++) {
		// for (int j = 0; j < cols; j++) {
		// // System.out.println("Element at [" + i + "][" + j + "] : " + matrix[i][j]);
		// System.out.print(matrix[i][j] + " ");
		// }
		// System.out.println();
		// }
		// System.out.println("TRANSPOSE MATRIX :- ");
		// for (int i = 0; i < cols; i++) {
		// for (int j = 0; j < rows; j++) {
		// System.out.print(matrix[j][i] + " ");
		// }
		// System.out.println();
		// }
		// sc.close();

		// SPIRAL OF MATRIX

		// Scanner sc = new Scanner(System.in);

		// System.out.print("Enter number of rows : ");
		// int rows = sc.nextInt();

		// System.out.print("Enter number of columns : ");
		// int cols = sc.nextInt();

		// int matrix[][] = new int[rows][cols];

		// for (int i = 0; i < rows; i++) {
		// for (int j = 0; j < cols; j++) {
		// System.out.print("Enter Element at [" + i + "][" + j + "] : ");
		// matrix[i][j] = sc.nextInt();
		// }
		// }

		// System.out.println("The Spiral Order Matrix is : ");
		// int rowS = 0;
		// int rowE = rows - 1;
		// int colS = 0;
		// int colE = cols - 1;

		// while (rowS <= rowE && colS <= colE) {
		// for (int j = colS; j <= colE; j++) {
		// System.out.print(matrix[rowS][j] + " ");
		// }
		// rowS++;

		// for (int i = rowS; i <= rowE; i++) {
		// System.out.print(matrix[i][colE] + " ");
		// }
		// colE--;

		// // ✅ ADDED boundary check to avoid extra printing
		// if (rowS <= rowE) {
		// // ← Bottom row
		// for (int j = colE; j >= colS; j--) {
		// System.out.print(matrix[rowE][j] + " ");
		// }
		// rowE--;
		// }

		// // ✅ ADDED boundary check to avoid extra printing
		// if (colS <= colE) {
		// // ↑ Left column
		// for (int i = rowE; i >= rowS; i--) {
		// System.out.print(matrix[i][colS] + " ");
		// }
		// colS++;
		// }
		// }
		// sc.close();

	}
}
