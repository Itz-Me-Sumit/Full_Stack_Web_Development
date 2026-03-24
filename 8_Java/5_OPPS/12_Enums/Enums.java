// Enum -> Enumerations ( Enumerated type )
// Enum -> Predefined set of constants.

enum paymentStatus{
    SUCCESS,
    FAILED,
    PENDING;
}

public class Enums {
    public static void main(String[] args){

        paymentStatus Status = paymentStatus.SUCCESS;
        System.out.println(Status.name());

    }    
}