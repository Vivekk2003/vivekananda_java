//Here, we can use the == operator to check for the null strings.
public class StringIsEmptyExample4 {
    public static void main(String argvs[])
    {
        String str = null;
        if(str == null)
        {
            System.out.println("The string is null.");
        }
        else
        {
            System.out.println("The string is not null.");
        }
    }
}
