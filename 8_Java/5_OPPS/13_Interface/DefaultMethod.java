interface Vehical{
    default void Drive(){
        System.out.println("Vehical is driving");
    }

    void brake();
}

class Car implements Vehical{
    @Override
    public void brake(){
        System.out.println("Brakes Implemented");
    }
}

public class DefaultMethod {
    public static void main(String [] args){
        Vehical C = new Car();
        C.Drive();
        C.brake();
    }
}
