package strings;

import java.util.*;

public class strings {
	public static void main(String[] args) {

		// STRINGS ARE IMMUTABLE.

		String firstName = "Megha";
		String lastName = "Harbola";
		String fullName = firstName + " " + lastName; // concatination

		System.out.println(fullName);
		System.out.println(fullName.length()); // length

		// charAt
		for (int i = 0; i < fullName.length(); i++) {
			System.out.println(fullName.charAt(i));
		}

		// String1.compareTo(String2) is used to compare to strings.
		// string1 > string2 : +ve
		// string1 = string2 : 0
		// string1 < string2 : -ve

		if (firstName.compareTo(lastName) > 0) {
			System.out.println("String 1 is bigger.");
		} else if (firstName.compareTo(lastName) < 0) {
			System.out.println("String 2 is bigger.");
		} else {
			System.out.println("Both Strings are equal.");
		}

		// sub-string : String_name.substring(starting index, ending index-1)
		String Sentence = "IILM UNIVERSITY, greater noida";
		System.out.println(Sentence.substring(5, 15));

		// PARSING
		// string -> int
		String str = "123";
		int number = Integer.parseInt(str);
		System.out.println(number);

		// int -> string
		// that's why we able to find length, bcz we can't find the length of integers.
		int num = 123;
		String strs = Integer.toString(num);
		System.out.println(strs.length());

	}
}
