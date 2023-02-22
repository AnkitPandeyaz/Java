/**
 * This program correctly compares two String objects using the (.equals) method.
 */

public class A41_StringCompare {
    public static void main(String[] args) {
        String name1 = "Mark",
                name2 = "Mark",
                name3 = "Mary";

        // compare "Mark" and "Mark"

        if (name1 == (name2)) {
            System.out.println(name1 + " and " + name2 + " are the same.");
        } else {
            System.out.println(name1 + " and " + name2 + " are not the same.");
        }

        // compare "Mark" and "Mary"
        // we can use ().equals) at the place of(==).

        if (name1.equals(name3)) {
            System.out.println(name1 + " and " + name3 + " are the same.");
        } else {
            System.out.println(name1 + " and " + name3 + " are not the same.");
        }
    }

}
