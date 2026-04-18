import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;
    public Student(String name , int marks){
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student other){
        if(this.marks != other.marks) return this.marks - other.marks;
        return this.name.compareTo(other.name);
    }
}

public class comparable_Interface {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student("Sumit" , 95));
        list.add(new Student("Shivam" , 80));
        list.add(new Student("Shivani" , 70));
        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.name + " " + s.marks);
        }
    }
}
