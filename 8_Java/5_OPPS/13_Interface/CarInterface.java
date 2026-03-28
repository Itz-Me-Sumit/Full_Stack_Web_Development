interface Car{
    void drive();
}

class Thar implements Car{
    @Override
    public void drive(){
        System.out.println("Thar is Driving");
    }
}

public class CarInterface {
    public static void main(String[] args){
        Car c = new Thar();
        c.drive();
    }    
}
