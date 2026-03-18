class Outer{
    class Inner{

    }
}

public class InnerClass {
    public static void main(String [] args){

        Outer outerClass = new Outer();

        Outer.Inner inner = outerClass.new Inner();
    }    
} 
