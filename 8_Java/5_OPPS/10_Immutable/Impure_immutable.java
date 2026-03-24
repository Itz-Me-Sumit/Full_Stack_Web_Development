// Not Purely Immutable

final class Student{

    private final String name;
    private final int age;
    private final college college;

    Student(String name , int age  , college college){
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public college getCollege(){
        return college;
    }

}

class college{
    String name;
    String add;

    college(String name , String add){
        this.name = name;
        this.add = add;
    }

}

public class Impure_immutable {
    public static void main(String [] args){
        college c = new college("IIT Madras" , "Chinnai");
        Student s = new Student("Sumit" , 20 , c);
        System.out.println(s.getCollege().name);

        s.getCollege().name = "IIT Bombay";

        System.out.println(s.getCollege().name);

    }    
}
