public class ExceptionHandling {
    public static void main(String [] args){
        int a = 5;
        int b = 0;

        methodA(a,b);

        // System.out.println(a/b);
    }

    public static void methodA(int a , int b){
        methodB(a,b);
    }

    public static void methodB(int a , int b){
        System.out.println(a/b);
    }

}
