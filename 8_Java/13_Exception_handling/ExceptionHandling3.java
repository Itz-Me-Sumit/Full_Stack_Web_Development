public class ExceptionHandling3 {
    public static void main(String[] args){
        try{

            System.out.println("Outer Try Start.");
            
            try{
                System.out.println("Inner Try Start.");
                System.out.println(5/0); // new ArithemeticException
                System.out.println("Inner Try Ends"); 
            }
            catch(ArithmeticException e){
                System.out.println("Inner: Divide By Zero Is Not Allowed");
            }

        }
        catch(ArithmeticException e){
            System.out.println("Outer: Divide By Zero Is Not Allowed");
        }

    }
}