/*  if the elements that have to be attached with the delimiter are null then, we get the ambiguity.
 It is because there are two join() methods, and null is acceptable for both types of the join() method.
 Observe the following example.
 this program can produces either error or a warning

public class StringJoinExample4 {
    public static void main(String args[])
    {
        String str = null;
        str = String.join("India", null);
        System.out.println(str);
    }
}
*/

