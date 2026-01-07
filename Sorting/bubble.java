package Sorting;

public class bubble {

	// TIME COMPLEXITY : O(n^2)
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 7, 8, 3, 1, 2 };

		for (int k = 0; k < arr.length - 1; k++) {
			for (int i = 0; i < arr.length - 1 - k; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.print("Sorted Array : ");
		printArray(arr);
	}
}
