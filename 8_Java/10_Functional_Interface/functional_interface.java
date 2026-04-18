import java.util.function.*;
import java.util.*;
public class functional_interface {
    public static void main(String[] args){

        Function<Integer,Integer> square = x -> x*x;
        System.out.println(square.apply(5));

        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(7);

        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

        Predicate<Integer> predicate = x -> x%2==0;
        System.out.println(predicate.test(9));

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,6,5,7));
        for(Integer i : list){
            System.out.print(i+" ");
        }

        list.forEach(x -> System.out.println(x));

    }      
}