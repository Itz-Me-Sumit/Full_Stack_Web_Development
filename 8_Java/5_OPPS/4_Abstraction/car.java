abstract class carClass{
    
    void start(){
        System.out.println("Car Started");
    }

    abstract void accelerate();
    abstract void brake();

}

class fuelCar extends carClass{
    
    @Override
    void accelerate(){
        System.out.println("Accelerated Your Fule car");
    }

    void brake(){
        System.out.println("Brake Implemented in Fule Car");
    }

}

class electricCar extends carClass{

    @Override
    void accelerate(){
        System.out.println("Accelerated Your Electric car");
    }

    void brake(){
        System.out.println("Brake Implemented in Electric Car");
    }

}


public class car {

    public static void main(String [] args){

        carClass fuel_car = new fuelCar();
        fuel_car.accelerate();
        fuel_car.brake();

        carClass electric_car = new electricCar();
        electric_car.accelerate();
        electric_car.brake();
    
    }
}
