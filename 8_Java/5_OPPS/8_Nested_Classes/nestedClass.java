// Static Nested

class Outer{
    static class Inner{
        
    }
}

public class nestedClass {
    public static void main(String [] args){
        Outer.Inner innerClass = new Outer.Inner();
    }    
}
