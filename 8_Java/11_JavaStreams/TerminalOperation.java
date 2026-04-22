import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class TerminalOperation {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>(List.of(4,2,8,5,9,1,3));
        
        List<Integer> l = list.stream()
                              .map(x -> x+1)
                              .toList();
        // this "toList()" is immutable , so we can use ."collect()" for mutablity.
        System.out.println(l);

        List<Integer> l2 = list.stream()
                               .map( x -> x+1)
                               .sorted( (a,b) -> b-a )
                               .collect(Collectors.toList());     
        System.out.println(l2);

        Optional<Integer> sum = list.stream()
            .reduce( (a,b) -> a+b );
        System.out.println(sum.get());

        long count = list.stream()
            .filter(x->x%2==0)
            .count();
        System.out.println(count);

        Optional<Integer> FindFirst = list.stream()
            .filter( x -> x>4 )
            .filter( x -> x%2 == 0 )
            .map( x -> x*2 )
            .findFirst(); // finds first element which satisfies all conditions
        System.out.println(FindFirst.get());

        Optional<Integer> FindAny = list.stream()
            .filter( x -> x>4 )
            .filter( x -> x%2 == 0 )
            .map( x -> x*2 )
            .findAny(); //finds any element which satisfies all conditions

        boolean AnyMatch = list.stream()
            .filter(x->x>2)
            .anyMatch(x->x%2==1); // return boolean value if any one element satisfies all his condition.
        System.out.println(AnyMatch);

        boolean AllMatch = list.stream()
            .filter(x->x>2)
            .allMatch(x->x%2==1);
        System.out.println(AllMatch);

        boolean NoneMatch = list.stream()
            .filter(x->x>2)
            .noneMatch(x->x%2==1);
        System.out.println(NoneMatch);

        int sum2 = list.stream()
                       .filter(x->x%2==0)
                       .mapToInt(x->x)
                       .sum();
        System.out.println(sum2);

        OptionalInt max = list.stream()
                       .filter(x->x%2==0)
                       .mapToInt(x->x)
                       .max();
        System.out.println(max.getAsInt());

        System.out.println();

        List<String> l1 = new ArrayList<>(List.of("AA","BBB","CCCC","DD","EEEE"));
        Map<Integer,String> mp = l1.stream()
            .collect(Collectors.toMap(
                x -> x.length(),
                x -> x,
                (oldVal , newVal) -> oldVal // to avoid getting dublicate keys and getting errors
            ));
        System.out.println(mp);

        System.out.println();

        Map<Integer , List<String>> mp2 = l1.stream()
            .collect(Collectors.groupingBy(
                x->x.length()
            ));
        System.out.println(mp2);

        System.out.println();

        List<Integer> l3 = new ArrayList<>(List.of(1,14,11,9));

        Map<Boolean , List<Integer>> mp3 = l3.stream()
            .collect(Collectors.partitioningBy(x-> x%2==0));
        System.out.println(mp3);
    }
}
