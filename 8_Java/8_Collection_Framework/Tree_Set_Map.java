import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set_Map {
    public static void main(String[] args){

        TreeSet<Integer> set = new TreeSet<>();
        set.add(80);
        set.add(23);
        set.add(60);
        set.add(10);
        set.add(90);
        set.add(50);

        // SortedSet Interface

        // returns smallest value
        System.out.println(set.first()); 
        // rerurn largest value
        System.out.println(set.last()); 

        // return elements which is strictly lesser then 80
        System.out.println(set.headSet(80));
        System.out.println(set.headSet(80 , true));


        // return elements which is grater and equal to 80;
        System.out.println(set.tailSet(80)); 
        System.out.println(set.tailSet(80 , true));

        // return elements in range -> grater and equal to 23 and strictly less then 80.
        System.out.println(set.subSet(23 , 80));
        System.out.println(set.subSet(23 , false , 80 , true));

        // Navigable Set Interface

        // return largest number which is strictly smaller then 80.
        System.out.println(set.lower(80));
        // return Smallest number strictly greater then 60
        System.out.println(set.higher(80));

        // return largest number which is equals or smaller then 80.
        System.out.println(set.floor(80));
        // return smallest number which is equals or smaller then 80
        System.out.println(set.ceiling(80));

        System.out.println(set.pollFirst()); // Remove smallest Number
        System.out.println(set.pollLast()); // Remove largest Number

        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println(set.descendingSet()); // return elements in descending order;

        // Descending Iterator
        Iterator<Integer> it = set.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }






    }
}
