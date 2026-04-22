import java.util.Optional;

public class OptionalClass {
    public static void main(String [] args){
        Optional<String> name = getName();
        
        // Methods

        if(name.isPresent()) System.out.println(name.get());

        name.ifPresent(System.out::println);

        System.out.println(name.orElse("Unknown"));

        System.out.println(name.orElseGet( () -> "Unknown" ));

        System.out.println(name.orElseThrow());

        name.ifPresentOrElse(System.out::println , ()->System.out.println("Unknown"));
        

    }

    public static Optional<String> getName(){
        return Optional.of("Sumit");
        // return Optional.ofNullable(null);
    }

}
