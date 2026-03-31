import java.util.ArrayList;
import java.util.List;

public class WildcardWithUpperBounds {

    public static void main(String[] args){
        List<dog> dogs = new ArrayList<>();
        dogs.add(new dog());
        dogs.add(new dog());
        fun(dogs);

        List<Animal> animal = new ArrayList<>();
        animal.add(new Animal());
        animal.add(new Animal());
        fun(animal);

    }

    static void fun(List<? extends Animal> values){
        for(Animal a : values){
            a.eat();
        }

        // upper bound me aisa hai ki esme ham wahi List of objects pass kar sakte hai jo Animal ki child ho...maan lo dog class jo hai wo animal ka child class hai... to aab agar hamare paas List dog ki hai to esme ye to possible hai ki ham dog se Animal ke methods ko read ( thorugh .get() )kar sakte hai magar agar hamare pass dog class ka List hai to aab esme Animal class ko add nahi kar sakte kyuki child kabhi Parent class ko point nahi kar sakta...

    }

}


class Animal{
    void eat(){
        System.out.println("Eating");
    }

    void walk(){
        System.out.println("Walking");
    }
}

class dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}