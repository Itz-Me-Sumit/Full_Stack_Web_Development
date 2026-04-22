import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Java_Stream {
    public static void main(String [] args){

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(30);
        list.add(8);
        list.add(10);
        list.add(21);

        Stream<Integer> s = list.stream();
        s = s.filter( x-> x>=10 );
        s = s.map(x -> x*2);
        s.forEach(System.out :: println);

        System.out.println();

        list.stream()
            .filter(x -> x>=10 )
            .map(x -> x*2)
            .forEach(System.out::println);

        

    }    
}
