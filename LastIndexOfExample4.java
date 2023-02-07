//Java String lastIndexOf(String substring, int fromIndex) Method Example
public class LastIndexOfExample4 {
    public static void main(String[] args) {
        String str = "This is last index of example";
        int index = str.lastIndexOf("of", 25);
        System.out.println(index);
        index = str.lastIndexOf("of", 10);
        System.out.println(index); // -1, if not found
    }
}
