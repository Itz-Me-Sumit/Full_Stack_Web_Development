import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

// Custom Exception
class InvalidAgeException extends Exception{

    private int age;

    public InvalidAgeException(String message , int age){
        super(message);
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

}

public class CustomException {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            checkEligibility(age);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
            System.out.println("Entered age was: " + e.getAge());
        }
    }
    
    public static void checkEligibility(int age) throws InvalidAgeException{
        if(age<0){
            throw new InvalidAgeException("Age Can't be Negative" , age);
        }

        if(age>18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
 
}
