import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String[] args){
        List<dog> dogs = new ArrayList<>();
        dogs.add(new dog());
        dogs.add(new dog());

        fun(dogs);
    }

    static void fun(List<?> values){
        for(Object obj : values){
            System.out.println(obj.getClass().getName());
        }
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