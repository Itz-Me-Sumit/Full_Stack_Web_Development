public class autoboxing_unboxing {
    public static void main(String [] args){
        // Autoboxing
        int x = 10 ;
        Integer y = 11;
        System.out.println(x);
        System.out.println(y);


        // Unboxing
        Integer a = new Integer(10); // Autoboxing
        int b = a; // Unboxing
    }
}