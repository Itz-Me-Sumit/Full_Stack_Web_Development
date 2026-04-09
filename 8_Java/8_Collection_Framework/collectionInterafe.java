import java.util.*;

public class collectionInterafe {
    public static void main(String[] args){
        Collection <Integer> c = new ArrayList<>();
        for(int i = 1 ; i<=3 ; i++){
            c.add(i);
        }

        System.out.println(c);

        System.out.println(c.size());
        
        System.out.println(c.isEmpty());
        
        System.out.println(c.contains(3));
        
        Object [] obj = c.toArray();
        for(Object o : obj){
            System.out.println(o);
        }   

        // boolean addAll( Collection <? extexds E> c );
        c.addAll(List.of(2,3,4,5));
        System.out.println(c);    
        
        // boolean containsAll( Collection <?> c );
        System.out.println( c.containsAll( List.of(1,2,3) ) );

        // bollean removeAll( Collection <?> c );
        c.removeAll(List.of(1,2));
        System.out.println(c);

        // boolean retainAll( Collection <?> c );
        c.retainAll(List.of(3,3));
        System.out.println(c);

        // c.clear();
        c.clear();
        System.out.println(c);

    }

}
