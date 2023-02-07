//Java String contains() Method Example 2
public class ContainsExample2 {
    public static void main(String[] args) {
        String str = "Hello Javatpoint readers";
        boolean isContains = str.contains("Javatpoint");
        System.out.println(isContains);

        System.out.println(str.contains("javatpoint")); // false
    }
}

