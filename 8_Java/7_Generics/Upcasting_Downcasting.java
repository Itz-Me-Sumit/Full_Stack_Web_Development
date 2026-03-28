public class Upcasting_Downcasting {
    public static void main(String[] args){
        //Upcasting
        String s = "Hello";
        Object obj = s;
        System.out.println(obj);

        //Downcasting
        Object obj2 = "Sumit";
        String s2 = obj2.toString();
        System.out.println(s2);

        Object obj3 = 10;
        String s3 = obj3.toString();
        System.out.println(s3);

    }    
}
