import java.util.Objects;

class Student{
    String name;
    int age;

    @Override
    public boolean equals(Object obj){

        if(this == obj) return true;
        if(obj == null) return false;
        if(obj.getClass() != this.getClass()) return false;

        Student s = (Student) obj;
        return (this.name.equals(s.name) && this.age == s.age);
    }

    @Override
    public int hashCode(){

        // int result = 17;
        // result = result * 31 + age;
        // result = result * 31 + ( (name == null) ? 0 : name.hashCode() );
        // return result;

        return Objects.hash(name , age);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

public class cloneMethod  {
    public static void main(String [] args) throws CloneNotSupportedException {

        Student s1 = new Student();
        s1.name = "Sumit";
        s1.age = 20;
        
        Student s2 = new Student();
        s2.name = "Shivam";
        s2.age = 14;
        
        Student s3 = new Student();
        s3.name = "Sumit";
        s3.age = 20;

        Student s4 = (Student)s1.clone();

        // System.out.println(s1.equals(s2));
        // System.out.println(s3.equals(s1));

        // System.out.println(s1.hashCode() == s3.hashCode());

        // System.out.println(s1.getClass());
        // System.out.println(s2.getClass().getName());

        System.out.println(s1 instanceof Student);

    
    }
}
