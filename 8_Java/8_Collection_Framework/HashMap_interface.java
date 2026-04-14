import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class HashMap_interface {
    public static void main(String[] args){
        Map<Integer , String> map = new HashMap<>();
        map.put(101 , "Sumit");
        map.put(102 , "Shivam");
        map.put(103 , "Shivang");

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        
        System.out.println(map.containsKey(102));
        System.out.println(map.containsValue("Sumit"));
        System.out.println(map.get(101) + " " + map.get("112"));
        System.out.println(map.put(103 , "Shivangi"));

        System.out.println(map.remove(101));

        Map<Integer , String> map2 = new HashMap<>();
        map2.put(222 , "Arpit");
        map2.put(223 , "Aman");
        map2.put(224 , "Akansha");

        System.out.println(map);
        map.putAll(map2);
        System.out.println(map);
        
        // map.clear();
        // System.out.println(map);

        Set<Integer> keys  = map.keySet();
        Collection <String> values = map.values();

        Set < Map.Entry<Integer , String> > entries = map.entrySet();
        System.out.println(entries);

        System.out.println(map.getOrDefault(102 , "Unknown"));
        System.out.println(map.getOrDefault(131 , "Unknown"));

        map.putIfAbsent(102 , "Shivam"); // agar map me 102 ka key availble nahi hua to usko insert kar dena warna nahi.

        map.replace(102 , "Shiva"); // 101 key ki value ko replace ya bole o update kar dega...
        map.replace(101 , "Shivam" , "Shiva" ); // 101 ke old value ko tabhi replace karega agar uski old value "Shivam" hogi.

        System.out.println(map);

        Set< Map.Entry<Integer , String> > entriess = map.entrySet();
        for(Map.Entry<Integer , String> entry : entriess){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }




    }
}
