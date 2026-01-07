package others;

//System.out.println(); //syso
import java.util.*;
import java.util.Scanner;

public class theo { // class
    public static void main(String[] args) { // main
        // COMMENTS

        // single line comment
        /*
         * multiple line comments
         * are written in this format
         */

        // VARIABLES
        // String name = "Megha"; // S always in capital
        // int age = 18;

        // System.out.println(name);
        // System.out.println(age);

        // JAVA TYPES
        // 1-Primitive: store simple values

        // byte - 1 [-128 to 127]
        // short - 2
        // int - 4
        // long - 8
        // float - 4
        // double - 8
        // char - 2
        // boolean - 1

        // datatypes:
        // float pi = 3.14f;
        // double pii = 3.14097658748746;

        // char c = '@';
        // String name = "Megha";

        // boolean T = true;

        // int age = 17;
        // short age1 = 18;
        // long mobile = 987733002837L;

        // byte age2 = 2; // only take 1 digit/byte input

        // 2-Non Primitive/Reference: store complex values

        // input:- (need to import java.util.*;)
        Scanner sc = new Scanner(System.in);

        String Name = sc.next(); // take input from user before whitespace
        String full_name = sc.nextLine(); // take input string from user
        int age = sc.nextInt(); // take input integer value from user
        float pi = sc.nextFloat(); // take float value from user
        char alpha = sc.next().charAt(0); // take character value from user

        sc.close(); // need to close

    }
}