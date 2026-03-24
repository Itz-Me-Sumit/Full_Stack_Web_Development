// Immutable

final class Student{

    private final String name;
    private final int age;
    private final college college;

    Student(String name , int age  , college college){
        this.name = name;
        this.age = age;
        this.college = new college(college.name , college.add);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // Defensive Copy Of College
    public college getCollege(){
        return new college(this.college.name , this.college.add);
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

public class Purely_Immutable {
    public static void main(String [] args){
        college c = new college("IIT Madras" , "Chinnai");
        Student s = new Student("Sumit" , 20 , c);
        System.out.println(s.getCollege().name);

        s.getCollege().name = "IIT Bombay";

        System.out.println(s.getCollege().name);

    }    
}
