import java.util.ArrayList;
import java.util.List;

public class WildcardWithLowerBound {
    public static void main(String[] args){

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        fun(animals);


        
    }

    static void fun(List<? super Animal> values ){
        values.add(new Animal());

        // Lower bound me aisa ham usi class ke list ko pass kar sakte hai jise animal inherit kar rha ho bole to Animal ke uper ki sari class hi daal sakte hai...to maan lo aab apne paas Animal ki ek superclass hai "Living_being" to maal lo hame "Living_being" class ka list pass kiya gaya to aab ham es list me Animal class ko add kar sakte hai kyuki Animal child hai and parent child ko point kar sakta hai... but maan lo hame "Living_being" class list pass ki gai hai and hame ese read karna hai hame to ye compile time pe pata nahi na rahega ki class hearirchy me Animal se kitni uper hai to ham kaise read kar sakte hai

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