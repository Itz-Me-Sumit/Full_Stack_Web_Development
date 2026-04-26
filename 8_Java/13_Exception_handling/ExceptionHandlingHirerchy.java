public class ExceptionHandlingHirerchy {
    public static void main(String [] agrs){

        try{
            // System.out.println(5/0);
            // String s = null;
            // s.length();

            Object obj = "hello";
            Integer i = (Integer) obj;
        }
        catch(ArithmeticException e){
            System.out.println("cant't divide by zero");
        }
        catch(NullPointerException e){
            System.out.println("Nulls are not allowed");
        }
        catch(Exception e){
            System.out.println("Exception: "+ e.getMessage());
        }

    }
}
