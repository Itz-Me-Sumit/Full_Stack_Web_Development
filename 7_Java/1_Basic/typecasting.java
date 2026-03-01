public class typecasting {
    public static void main(String[] args){
        
        //  Implicit Convertion
        byte b = 24;
        int i =  b;
        System.out.println(i);

        char c = 'a';
        
        int m = c;
        System.out.println(m);


        // Explicit Conversion
        int a = 24;
        byte d = (byte) a;
        System.out.println(d);

    }
}
