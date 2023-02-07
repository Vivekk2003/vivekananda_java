//Counting the Number of Vowels in a String by Using the chatAt() Method

import java.util.*;
public class CharAtExample5 {
    ArrayList<Character> al;

    // constructor for creating and
// assigning values to the ArrayList al
    CharAtExample5() {
        al = new ArrayList<Character>();
        al.add('A');
        al.add('E');
        al.add('a');
        al.add('e');
        al.add('I');
        al.add('O');
        al.add('i');
        al.add('o');
        al.add('U');
        al.add('u');
    }

    private boolean isVowel(char c) {
        for (int i = 0; i < al.size(); i++) {
            if (c == al.get(i)) {
                return true;
            }
        }
        return false;
    }

    // a method that calculates vowels in the String s
    public int countVowels(String s) {
        int countVowel = 0; // store total number of vowels
        int size = s.length(); // size of string
        for (int j = 0; j < size; j++) {
            char c = s.charAt(j);
            if (isVowel(c)) {
                countVowel = countVowel + 1;
            }
        }
        return countVowel;
    }

    public static void main(String argvs[]) {
// creating an object of the class CharAtExample6
        CharAtExample5 obj = new CharAtExample5();

        String str = "Javatpoint is a great site for learning Java.";

        int noOfVowel = obj.countVowels(str);

        System.out.println("String: " + str);

        System.out.println("Total number of vowels in the string are: " + noOfVowel + "\n");

        str = "One apple in a day keeps doctor away.";

        System.out.println("String: " + str);

        noOfVowel = obj.countVowels(str);

        System.out.println("Total number of vowels in the string are: " + noOfVowel);
    }
}
