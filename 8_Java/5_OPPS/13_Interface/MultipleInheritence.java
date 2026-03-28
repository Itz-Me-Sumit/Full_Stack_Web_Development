interface A{
    void fun1();
}

interface B{
    void fun2();
}

class C implements A , B{

    @Override
    public void fun1(){

    }

    @Override
    public void fun2(){

    }

}

interface Animal{
    void eat();
}

interface Dog extends Animal{
    void bark();
}

class streetDogs implements Dog{
    @Override
    public void eat(){
        System.out.println("Eating");
    }

    @Override
    public void bark(){
        System.out.println("Barking");
    }

}



public class MultipleInheritence {
    public static void main(String [] args){
        
    }
}
