//Applications of substring() Method
//1) The substring() method can be used to do some prefix or suffix extraction.
// For example, we can have a list of names, and it is required to filter out names with surname as "singh". The following program shows the same.
public class SubstringExample3 {
    public static void main(String argvs[])
    {
        String str[] =
                {
                        "Praveen Kumar",
                        "Yuvraj Singh",
                        "Harbhajan Singh",
                        "Gurjit Singh",
                        "Virat Kohli",
                        "Rohit Sharma",
                        "Sandeep Singh",
                        "Milkha Singh"
                };

        String surName = "Singh";
        int surNameSize = surName.length();

        int size = str.length;

        for(int j = 0; j < size; j++)
        {
            int length = str[j].length();

            String subStr = str[j].substring(length - surNameSize);


            if(subStr.equals(surName))
            {
                System.out.println(str[j]);
            }
        }

    }
}
