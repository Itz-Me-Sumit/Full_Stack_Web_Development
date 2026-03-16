interface car{
    void start();
    void accelerate();
    void brake();
}

class fuelCar implements car{

    @Override
    public void start(){
        System.out.println("Fuel Car started using engine ignition.");
    }

    public void accelerate(){
        System.out.println("Fuel Car accelerating by increasing fuel supply.");
    }

    public void brake(){
        System.out.println("Fuel Car slowing down using brake pads.");
    }

}

class electricCar implements car{
    
    @Override
    public void start(){
        System.out.println("Electric Car started using battery power.");
    }

    public void accelerate(){
        System.out.println("Electric Car accelerating using electric motor.");
    }

    public void brake(){
        System.out.println("Electric Car braking using regenerative braking.");
    }

}

public class Main{
    public static void main(String[] args){

        fuelCar f = new fuelCar();
        electricCar e = new electricCar();

        f.start();
        f.accelerate();
        f.brake();

        System.out.println();

        e.start();
        e.accelerate();
        e.brake();
    }
}