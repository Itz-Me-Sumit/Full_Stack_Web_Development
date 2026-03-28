// Bounds in generics

//Upper Bound -> T is atleast Number Or its subtype

class Box <T extends Number> { // esse ham ye keh rhe hai ki T sirf wahi data type lega jo Number ko extends karta hai i.e. Integer , Double , Float, Byte..
    T value;

    public void printDouble(){

    }

}



class Box2 < T extends Animal & Swimmable >{

}

class Animal{
    void display(){
        System.out.println("Displaying Animal");
    }
}

interface Swimmable{
    void swim();
}


class Dog extends Animal{

}

class Fish extends Animal implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Fish is Swimming");
    }
}


public class BoundGenerics {
    public static void main(String[] args){
        
        Box<Double> b1 = new Box<>();
        b1.value=10.3;

        Box2<Fish> b2 = new Box2<>();

    }    
}
