class Student{
    String name;
    int age;

    @Override
    public String toString(){
        return (name + "\n" + age);
    }

}

public class toStringMethod{
    public static void main(String [] args){
        Student s1 = new Student();
        s1.name = "Sumit";
        s1.age = 20;

        System.out.println(s1.toString());

    }    
}
