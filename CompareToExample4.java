//Java String compareTo(): ClassCastException

import java.util.*;
class Players
{

    private String name;


    public Players(String str)
    {
        name = str;
    }

}

public class CompareToExample4
{


    public static void main(String[] args)
    {
        Players ronaldo = new Players("Ronaldo");
        Players sachin = new Players("Sachin");
        Players messi = new Players("Messi");
        ArrayList<Players> al = new ArrayList<>();

        al.add(ronaldo);
        al.add(sachin);
        al.add(messi);


        Collections.binarySearch(al, "Sehwag", null);
    }

}
