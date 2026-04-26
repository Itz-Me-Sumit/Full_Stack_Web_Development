import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class UseOfThrows {
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            checkEligibility(age);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            readFiles();
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        
    }

    public static void checkEligibility(int age){
        if(age<0){
            throw new IllegalArgumentException();
        }

        if(age>18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }

    public static void readFiles() throws FileNotFoundException {
        FileReader fr = new FileReader("Data.txt");
    }
}