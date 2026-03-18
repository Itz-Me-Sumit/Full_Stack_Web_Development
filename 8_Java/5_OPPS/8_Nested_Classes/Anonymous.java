class Person{
    void introduce(){
        System.out.println("Hi , I am a Person");
    }
}

public class Anonymous {
    public static void main(String [] args){
        Person p = new Person(){
            @Override
            void introduce(){
                System.out.println("Hi , I am a Guest");
            }
        };
        p.introduce();
    }    
}
