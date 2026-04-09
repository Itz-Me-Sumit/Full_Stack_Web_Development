import java.util.*;

public class List_Interface {
    public static void main(String[] args){
        // List -> ArrayList , LinkedList , Vector->Stack

        List<Integer> L = new ArrayList<>();
        
        for(int i = 1 ; i<= 3 ; i++){
            L.add(i);
        }
        System.out.println(L);

        // .get(index );
        System.out.println(L.get(1));
        
        // .set(index  , element);
        L.set(1 , 6);
        System.out.println(L.toString());

        // .addAll(index , list) , List.of(elements);
        L.addAll(1 , List.of(4,4,4));
        System.out.println(L);

        // .remove(index);
        L.remove(0);

        // . indexOf(Object)
        System.out.println(L.indexOf(3));

    }
}
