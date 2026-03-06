public class function_chaining{
    public static void main(String [] agrs){
        // Chaining Of Functions
        fun1();
    }

    static void fun1(){
        fun2();
        System.out.print("function Chaining");
    }

    static void fun2(){
        fun3();
        System.out.print("it is ");
    }

    static void fun3(){
        System.out.print("hello ");
    }

}