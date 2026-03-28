// Generics
class Box<T> { // T -> Type Parameter.
    private T value;

    Box(T value){
        this.value=value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

}

public class Generics {
    public static void main(String[] args){
        Box<Integer> b1 = new Box<Integer>(10); // Type Argument
        System.out.println(b1.getValue() + 10);

        Box<String> b2 = new Box<String>("Sumit");
        System.out.println(b2.getValue() + "Sumit");

        Box<Boolean> b3 = new Box<Boolean>(true);
        System.out.println(b3.getValue());

    }   
}
