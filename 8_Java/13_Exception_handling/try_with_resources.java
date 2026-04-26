import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class try_with_resources {
    public static void main(String [] args){

        try(FileReader fr = new FileReader("data.txt")){
            int ch;
            while((ch = fr.read()) != -1){
                System.out.print((char) ch);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File Has Not Found.");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
