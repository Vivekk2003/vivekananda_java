//Java String split() method example
public class SplitExample {
    public static void main(String args[]){
        String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
    }
}

