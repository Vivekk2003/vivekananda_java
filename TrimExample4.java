//Java String trim() Method Example 4
public class TrimExample4 {
    public static void main(String argvs[])
    {


        String str = " abc ";


        String str1 = str.trim();


        System.out.println(str.hashCode());
        System.out.println(str1.hashCode() + "\n");


        String s = "xyz";
        String s1 = s.trim();


        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

    }
}
