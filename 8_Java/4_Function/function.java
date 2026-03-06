
public class function {
    public static void main(String [] args){
         
        greet();
        System.out.println(sum(2,3));
        System.out.println(multiply(3,4));

        return;

    }

    //  Giving no return Type -> void

    static void greet(){
        System.out.println("Hello");
    }

    static int sum(int a , int b){
        return a+b;
    }

    static int multiply(int a , int b){
        return a*b;
    }

}
