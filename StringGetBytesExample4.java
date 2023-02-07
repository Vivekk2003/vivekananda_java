//Java String class getBytes() Method Example 4

public class StringGetBytesExample4 {
    public static void main(String argvs[])
    {
// input string
        String str = "Welcome to JavaTpoint.";
        System.out.println("The input String is : ");
        System.out.println(str + "\n");

// encoding into UTF - 17
        byte[] byteArr = str.getBytes();
        System.out.println("After converted into UTF-17 the String is : ");

        for (int j = 0; j < byteArr.length; j++)
        {
            System.out.print(byteArr[j]);
        }


    }
}

