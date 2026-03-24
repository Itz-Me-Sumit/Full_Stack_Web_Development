class Student{
    String name;
    int age;

    @Override
    public boolean equals(Object obj){

        if(this == obj) return true;
        if(obj == null) return false;
        if(obj.getClass() != this.getClass()) return false;

        Student s = (Student) obj;
        return (this.name == s.name && this.age == s.age);

    }
}

public class equalsMethod {
    public static void main(String [] args){
        
        Student s1 = new Student();
        s1.name = "Sumit";
        s1.age = 20;
        
        Student s2 = new Student();
        s2.name = "Shivam";
        s2.age = 14;
        
        Student s3 = new Student();
        s3.name = "Sumit";
        s3.age = 20;

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s1));
        
    }
}
