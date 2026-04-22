import java.util.Optional;

class User{
    public Address address;
}

class Address{
    public String city;
}

public class OptionalClass2 {
    public static void main(String[] args){
        

        /*
        User user = getUser();
        if(user!=null){
            Address address = user.address;
            if (address!=null){
                String city = address.city;
                if(city!=null){
                    System.out.println(city);
                }
            }
        }
        */

        Optional<User> user = getUser();
        user.map(x -> x.address)
            .map(y -> y.city)
            .ifPresent(System.out::println);


    }

    private static Optional<User> getUser(){

        Address a = new Address();
        a.city = "Begusarai";

        User u = new User();
        u.address = a;

        return Optional.of(u);

    }

}
