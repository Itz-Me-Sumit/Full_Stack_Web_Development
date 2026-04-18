import java.util.*;

class Student implements Comparable<Student>{
    String name;
    Integer rollNum;
    Integer marks;

    public Student(String name , Integer rollNum , Integer marks){
        this.name=name;
        this.rollNum=rollNum;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student s){
        return this.marks - s.marks;
    }

}

class sortByName implements Comparator<Student>{
    @Override
    public int compare(Student s1 , Student s2){
        return s1.name.compareTo(s2.name);
    }
}

class sortByRollNum implements Comparator<Student>{
    @Override
    public int compare(Student s1 , Student s2){
        return s1.rollNum.compareTo(s2.rollNum);
    }
}

class sortByMarks implements Comparator<Student>{
    @Override
    public int compare(Student s1 , Student s2){
        return s1.marks.compareTo(s2.marks);
    }
}


public class comparator_Interface {
    public static void main(String[] args){

        List<Student> Student = new ArrayList<>();

        Student.add(new Student("Sumit" , 101 , 20));
        Student.add(new Student("Shivam" , 102 , 50));
        Student.add(new Student("Shivang" , 103 , 40));
        Student.add(new Student("Shivangi" , 104 , 30));

        Comparator<Student> sortByName = new sortByName();
        Comparator<Student> sortByMarks = new sortByMarks();
        Comparator<Student> sortByRollNum = new sortByRollNum();

        Collections.sort(Student , sortByName);
        for(Student s : Student){
            System.out.println(s.name + " , " + s.marks + " , " + s.rollNum);
        }

        System.out.println();

        Collections.sort(Student , sortByMarks);
        for(Student s : Student){
            System.out.println(s.name + " , " + s.marks + " , " + s.rollNum);
        }

        System.out.println();

        Collections.sort(Student , (s1 , s2) -> s1.rollNum - s2.rollNum);
        for(Student s : Student){
            System.out.println(s.name + " , " + s.marks + " , " + s.rollNum);
        }

    }
}
