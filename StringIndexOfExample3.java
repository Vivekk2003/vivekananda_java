//Java String indexOf(String substring, int fromIndex) Method Example
public class StringIndexOfExample3 {
    public static void main(String[] args) {
        String s1 = "This is indexOf method";

        int index = s1.indexOf("method", 10); //Returns the index of this substring
        System.out.println("index of substring "+index);
        index = s1.indexOf("method", 20); // It returns -1 if substring does not found
        System.out.println("index of substring "+index);
    }
}
