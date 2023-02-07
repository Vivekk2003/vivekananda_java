//Java String replace(CharSequence target, CharSequence replacement) method example
public class ReplaceExample2 {
    public static void main(String args[]){
        String s1="my name is khan my name is java";
        String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString);
    }
}
