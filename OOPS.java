// class name by convention starts from CAPITAL LETTER.
// function name by convention starts from SMALL LETTER.

// import java.util.*;
class City { // CLASS
	String name;
	String location;

	void loc() {
		System.out.println(this.name + " is located at " + this.location);
	}

	void loc(String locate) { // polymorphism
		System.out.println(this.name + " is located at " + locate);
	}
}

public class OOPS {

	public static void main(String[] args) {
		City c1 = new City(); // OBJECT
		c1.name = "Greater Noida";
		c1.location = "Uttar Pradesh";

		// System.out.println(c1.name + " : " + c1.location);
		c1.loc();
		c1.loc("Noida");
	}
}
