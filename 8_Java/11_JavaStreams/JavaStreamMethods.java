import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaStreamMethods {
    public static void main(String [] agrs){
        List<Integer> list = new ArrayList<>(List.of(21,1,32,10,54,22,11 , 21 , 54));

        list.stream()
            .filter( x -> x>2 )
            .filter( x -> x%2 == 0 )
            .map( x -> x*2 )
            .peek(System.out::println) // debuger
            .sorted() // for descending order => .sorted( (a,b) -> b-a )
            .distinct() // keep distinct values only
            .forEach(System.out::println);
        
        System.out.println();

        List< List<Integer> > list2 = List.of(
            List.of(1,2),
            List.of(3,4),
            List.of(5,6),
            List.of(7,8)
        );

        System.out.println();

        list2.stream()
             .flatMap( x -> x.stream() )
             .forEach(System.out::println);

        System.out.println();

        Stream.iterate(1 , x -> x+1)
              .limit(20)
              .skip(5) // skip first 5 element
              .forEach(System.out::println);

        System.out.println();

    }
}
