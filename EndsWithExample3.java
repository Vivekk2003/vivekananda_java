//Java String endsWith() Method Example 3
public class EndsWithExample3 {
    public static void main(String argvs[])
    {
        String str = "Welcome to JavaTpoint";


        System.out.println(str.endsWith("javaTpoint")); // false because J and j are different
        System.out.println(str.endsWith("Javatpoint")); // false because T and t are different
        System.out.println(str.endsWith("JavaTpoint")); // true because every character is same

    }
}
