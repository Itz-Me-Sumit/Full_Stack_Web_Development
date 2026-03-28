// If Default Method is Not Implemented
interface A{
    void fun();
}

interface B extends A{
    void fun();
}

interface C extends A{
    void fun();
}

class D implements B , C{
    @Override
    public void fun(){
        System.out.println("Solved Dimond Problem");
    }
}



// When Default method is Implemented
interface one{
    void fun();
}

interface two extends one{
    default void fun(){
        System.out.println("Two");
    }
}

interface three extends one{
    default void fun(){
        System.out.println("Three");
    }
}

class four implements two , three {
    @Override
    public void fun(){
        two.super.fun();
        three.super.fun();
    }
}



public class DimondProblem {
    public static void main(String [] args){
        one O = new four();
        O.fun();
    }
}