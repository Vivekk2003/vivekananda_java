/*f the elements that have to be attached with the delimiter have some strings,
 in which a few of them are null, then the null elements are treated as a normal string,
 and we do not get any exception or error.*/
public class StringJoinExample5 {
    public static void main(String argvs[])
    {
        String str = null;


        str = String.join("-", null, " wake up ", " eat ", " write content for JTP ", " eat ", " sleep ");
        System.out.println(str);
    }
}
