// (parent) A --> B (Child of A) --> C (Child of B) --> so on 

class Student{
    String name;
    int age;
    void markAttendence(){
        System.out.println("Attendence Marked By Student "+name);
    }
}

class EngineeringStudent extends Student{
    void attendLab(){
        System.out.println("Lab Attended By Student "+name);
    }
}

class CSEengineeringStudent extends EngineeringStudent{
    void codingAssignment(){
        System.out.println("Coding Assignment Done By "+name);
    }
}

// Student -> EngineeringStudent -> CSEengineeringStudent

public class multi_level_Inheritance {
    public static void main(String [] args){

    }
}
