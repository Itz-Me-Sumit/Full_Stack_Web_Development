class Outer{
    Object greet(){
        int y = 10;

        class Local{
            void fun(){
                System.out.println(y);
            }
        }

        Local l = new Local();
        l.fun();
        return l;
    }

    void fun(){
        Object O = greet();
    }

}

public class LocalClass {
    public static void main(String [] args){
        Outer outer = new Outer();
        outer.fun();
        outer.greet();
    }
}
