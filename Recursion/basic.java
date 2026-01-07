// import java.util.*;

public class basic {
	public static void sum(int n) {
		if (n == 0) {
			return;
		}
		sum(n + 1);
		System.out.println();
	}

	public static void main(String[] args) {
		sum(10);
	}
}
