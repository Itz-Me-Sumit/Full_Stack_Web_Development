import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Iterable_Interface {
    public static void main(String[] args){

        List<Integer> arraylist = new ArrayList<>();
        for(int i = 10 ; i<=50 ; i+=10){
            arraylist.add(i);
        }

        // print Using Iterator
        System.out.println("print Using Iterator");
        Iterator<Integer> iter = arraylist.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
        System.out.println();

        // print using for each loop
        System.out.println("print using for each loop");
        for(Integer i : arraylist){
            System.out.println(i);
        }

    }    
}
