//Accessing First and Last Character by Using the charAt() Method
public class CharAtExample2 {
    public static void main(String[] args) {
        String str = "Welcome to Javatpoint portal";
        int strLength = str.length();

        System.out.println("Character at 0 index is: "+ str.charAt(0));

        System.out.println("Character at last index is: "+ str.charAt(strLength-1));
    }
}
