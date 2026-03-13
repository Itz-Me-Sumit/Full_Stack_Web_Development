public class Encapsulation {
    public static void main(String [] args){

        /*
        Encapsulation:
            1) Both Data and Behaviour should be together in one class
            2) Should Not Provide Unrestrected Access to data.
        */

        /*
        4 Access Modifiers
            1) Public
            2) default
            3) protected
            4) private    
        */ 

    }
}


class BankAccount{
    private double balance; // private karne se ab es vaiable ko class ke bahar access nahi kiya ja payega.

    int due;
    /*
    default int due;  
         anyone belongin to same package(same folder me rakhe sare code file) can access , package bole to wo folder jisme sare code file rakhe hue hai
            agar ham agae kuch nahi bhi likhte to default access modifier lag jata hai... esiliye default likhe ki jarurat nahi hai
     */

    protected double deposit; // from same package or from inhireted class can access

    public double withdrawl; // anyone can access

}