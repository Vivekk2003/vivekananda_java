//Java String replace() Method Example 4
//The replace() method throws the NullPointerException when
// the replacement or target is null.
// The following example confirms the same.
public class ReplaceExample4 {
    public static void main(String argvs[])
    {

        String str = "For learning Java, JavaTpoint is a very good site.";
        int size = str.length();

        System.out.println(str);
        String target = null;

// replacing null with JavaTpoint. Hence, the NullPointerException is raised.
        str = str.replace(target, "JavaTpoint ");

        System.out.println(str);

    }
}
