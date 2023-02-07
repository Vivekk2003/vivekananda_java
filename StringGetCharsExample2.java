//Java String getChars() Method Example 2
public class StringGetCharsExample2 {
    public static void main(String[] args) {
        String str = new String("Welcome to Javatpoint");
        char[] ch  = new char[20];
        try {
            str.getChars(1, 26, ch, 0);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}