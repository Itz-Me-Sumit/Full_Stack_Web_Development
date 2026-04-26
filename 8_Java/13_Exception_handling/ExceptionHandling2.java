public class ExceptionHandling2 {
    public static void main(String[] args){

        System.out.println("Step 1");

        try{ // Risky Code
            int a = 5;
            int b = 0;
            System.out.println(a/b);

            System.out.println("It will never run due to exception");

        }
        catch(ArithmeticException e){ // preventive / handling code
            System.out.println(e.getMessage());
        }
        finally{ // clean-up code
            //This will Always Run
            System.out.println("Finally Block");
        }

        System.out.println("Step 2");
        
    }
}
