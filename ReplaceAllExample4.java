//Java String replaceAll() Method Example 4
public class ReplaceAllExample4
{
    // main method
    public static void main(String argvs[])
    {

// input string
        String str = "For learning Java, JavaTpoint is a very good site.";

        System.out.println(str);

        String regex = "||"; // the regular expression is not valid.

// invoking the replaceAll() method raises the PatternSyntaxException
        str = str.replaceAll(regex, "JavaTpoint ");

        System.out.println(str);

    }
}