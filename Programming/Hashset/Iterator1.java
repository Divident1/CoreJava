package Programming.Hashset;

import java.util.HashSet;
import java.util.Iterator;




public class Iterator1 {
    public static void main(String[] args) {
        
        HashSet<String>  hashed= new HashSet<>();

        System.out.println(hashed.isEmpty());
        hashed.add("Ramu");
        hashed.add("Ganesh");

        hashed.clear();
        System.out.println(hashed);

       /*  Iterator<String> itr= hashed.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } */
    }
}
