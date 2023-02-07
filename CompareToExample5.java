//Java String compareTo(): NullPointerException
public class CompareToExample5 {
    public static void main(String[] args)
    {

        String str = null;

        int no =  str.compareTo("India is my country.");

        System.out.println(no);
    }
}

