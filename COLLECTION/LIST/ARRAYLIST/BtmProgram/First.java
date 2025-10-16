package COLLECTION.LIST.ARRAYLIST.BtmProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class First {
    public static void main(String[] args) {
        
        List<String> li = new ArrayList<>();

        li.add("Gotam");
        li.add("Singh");
        li.add("Developer");


        Iterator it= li.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println(li);
    }
}
