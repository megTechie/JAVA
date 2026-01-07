package others;

public class BitManipulation {
	public static void main(String[] args) {
		// Bitwise Operator:
		// & : AND
		// | : OR
		// ^ : XOR
		// ~ : Compliment
		// << : Left Shift
		// >> : Right Shift

		// GET bit : to find what is value(high or low) at specific pos.
		// SET bit : CHANGE TO 1 (0 -> 1 and if 1 -> 1)
		// CLEAR bit : CHANGE TO 0 (1 -> 0 and if 0 -> 0)
		// UPDATE bit : CHANGE BIT if (1 -> 0) and if (0 -> 1)

		// // GET BIT
		// int n = 5; // (0101)
		// int pos = 3; // pos - indexing from right to left
		// int bit_mask = 1 << pos;
		// if ((bit_mask & n) == 0) {
		// System.out.println("It was 0");
		// } else {
		// System.out.println("It was 1");
		// }

		// // SET BIT
		// int n = 5; // (0101)
		// int pos = 0; // pos - indexing from right to left
		// int bit_mask = 1 << pos;
		// int ans = bit_mask | n;
		// System.out.println(ans);

		// // CLEAR BIT
		// int n = 5; // (0101)
		// int pos = 2; // pos - indexing from right to left
		// int bit_mask = 1 << pos;
		// int NOTbit_mask = ~(bit_mask);
		// int ans = NOTbit_mask & n;
		// System.out.println(ans);

		// // UPDATE BIT : may be wrong
		// int n = 5; // (0101)
		// int pos = 1; // pos - indexing from right to left
		// int bit_mask = 1 << pos;
		// if ((bit_mask & n) == 0) {
		// int ans = bit_mask | n;
		// System.out.println(ans);
		// } else {
		// int NOTbit_mask = ~(bit_mask);
		// int ans = NOTbit_mask & n;
		// System.out.println(ans);
		// }

	}
}
