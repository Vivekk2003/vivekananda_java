//Java String trim() Method Example 3
public class TrimExample3 {
    public static void main(String argvs[])
    {

        String str = " abc ";

        if((str.trim()).length() > 0)
        {
            System.out.println("The string contains characters other than white spaces \n");
        }
        else
        {
            System.out.println("The string contains only white spaces \n");
        }

        str = "    ";

        if((str.trim()).length() > 0)
        {
            System.out.println("The string contains characters other than white spaces \n");
        }
        else
        {
            System.out.println("The string contains only white spaces \n");
        }

    }
}
