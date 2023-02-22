//This program demonstrates a few of the String Methods.

public class A23_StringMethods {
    public static void main(String[] args){
        String message = "Java is Grate fun!!";
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        char letter = message.charAt(2);
        int stringSize = message.length();


        System.out.println(message);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(letter);
        System.out.println(stringSize);
    }
    
}
