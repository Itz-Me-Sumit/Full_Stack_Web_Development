import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Hash_set_Map_Interface {
    public static void main(String[] args){
        
        /*
            Set -> 3 Type
            1) HashSet
            2) LinkedHashSet
            3) TreeSet
        */
        Set<String> hashset = new HashSet<>();

        hashset.add("Sumit");
        hashset.add("Shivam");
        hashset.add("Ashok");

        System.out.println(hashset.contains("Sumit"));
        
        /*
            Set -> 3 Types
            1) HashMap
            2) LinkedHashSet
            3) TreeMap
        */

        Map<Integer , String> hashmap = new HashMap<>();

        hashmap.put(101 , "Sumit");
        hashmap.put(102 , "Shivam");
        hashmap.put(103 , "Shivang");

        System.out.println(hashmap.containsKey(101));
        System.out.println(hashmap.get(102));
        System.out.println(hashmap.containsValue("Sumit"));

        
        

    }
}
