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
        System.out.println(L);

        // . indexOf(Object)
        System.out.println(L.indexOf(3));

        // ListIterator
        ListIterator<Integer> L_Iter = L.listIterator();
        while(L_Iter.hasNext()){
            System.out.print(L_Iter.next()+" ");
        }
        System.out.println();

        // Start from index 2
        ListIterator<Integer> L_Iter1 = L.listIterator(2);
        while(L_Iter1.hasNext()){
            System.out.print(L_Iter1.next()+" ");
        }
        System.out.println();

        // Reverse Iteration, aur index insert kiya hai to index 4 se start hoga and reverse me iteration karega.
        ListIterator<Integer> L_Iter_reverse = L.listIterator(4);
        while(L_Iter_reverse.hasPrevious()){
            System.out.print(L_Iter_reverse.previous()+" ");
        }
        while(L_Iter_reverse.hasPrevious()){
            System.out.print(L_Iter_reverse.previousIndex()); // ye previous wala index to print kar dega par cursor phir piche ki taraf move nahi karega to hame manualy cursor piche ki taraf move karna parega
            L_Iter_reverse.previous(); // it'll move cursor to previous index
        }
        System.out.println();

        // Imutable list
        List<Integer> l = List.of(1,2,3,4,5,6,7);
        // l.add(20); Can't add anything 

        // .copyOf()
        List <Integer> l2 = List.copyOf(l); // it is also Imutable
        System.out.println(l2); 
            
    }
}
