import java.util.TreeMap;

public class TreeMap_Interface {
    public static void main(String[] args){

        TreeMap<Integer , String> map = new TreeMap<>();

        map.put(101 , "Sumit");
        map.put(102 , "Shivam");
        map.put(103 , "Shivang");

        System.out.println(map.firstKey()); // return smallest key
        System.out.println(map.lastKey()); // return Largest Key
        
        System.out.println(map.firstEntry());  // return key-value pair having smallest key in map.
        System.out.println(map.lastEntry()); // return key-value pair having largest key in map.

        System.out.println(map.headMap(102 , true));
        // wo sare key-value pair dega jiske key 102 se chhote honge...by default 102 exclusive hoga yani ki 102 waka key-value pair nahi print hoha but ham inclusive:true karke usko bhi samil kar sakte hai.
        System.out.println(map.tailMap(103));
        // wo sare key-value pair kiska key 103 se jada hoga , by default 103 is inclusive

        System.out.println(map.subMap(101,103)); 
        // print value which is greater then or equal to 101 and structly less then 103.

        // Sorted Map

        System.out.println(map.lowerKey(102));
        // return largest value lesser then 102
        System.out.println(map.lowerEntry(102));
        // return key-value pair having largest key which is lesser then 102

        System.out.println(map.floorKey(102));
        // return smallest key value greater then 102.
        System.out.println(map.floorEntry(102));
        // return key-value pair having smallest key which is greater then 102.

        System.out.println(map.higherKey(102));
        System.out.println(map.higherEntry(102));
        


    }
}
