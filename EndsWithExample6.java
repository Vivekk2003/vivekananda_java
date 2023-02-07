//Java String endsWith() Method Example 6
public class EndsWithExample6 {
    public static void main(String argvs[])
    {

        if("Welcome to JavaTpoint".endsWith(""))
        {
            System.out.println("Inside the if block");
        }
        else
        {
            System.out.println("Inside the else block");
        }

        if("Welcome to JavaTpoint".endsWith("point"))
        {
            System.out.println("Inside the if block");
        }
        else
        {
            System.out.println("Inside the else block");
        }

        if("Welcome to JavaTpoint".endsWith("xyz"))
        {
            System.out.println("Inside the if block");
        }
        else
        {
            System.out.println("Inside the else block");
        }
    }
}

