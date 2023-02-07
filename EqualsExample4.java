//Java String equals() Method Example 4
public class EqualsExample4 {
    public static void main(String argvs[])
    {
// Strings
        String str = "a";
        String str1 = "123";
        String str2 = "45.89";
        String str3 = "false";
        Character c = new Character('a');
        Integer i = new Integer(123);
        Float f = new Float(45.89);
        Boolean b = new Boolean(false);

        System.out.println(str.equals(c));

        System.out.println(str1.equals(i));

        System.out.println(str2.equals(f));

        System.out.println(str3.equals(b));

        System.out.println(str.equals(c.toString()));
        System.out.println(str1.equals(i.toString()));
        System.out.println(str2.equals(f.toString()));
        System.out.println(str3.equals(b.toString()));
    }
}

