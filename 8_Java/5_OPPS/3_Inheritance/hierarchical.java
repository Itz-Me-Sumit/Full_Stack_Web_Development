/*

            A
          /   \
         B     C
       / \    / \
      D   E  F   G
*/

class Student{  // Class A
    String name;
    int age;

    Student(String name , int age){
        this.name=name;
        this.age=age;
    }

    void markAttendence(){
        System.out.println("Attendence Marked By Student "+name);
    }
}

class EngineeringStudent extends Student{  // Class B
    
    double cgpa;

    EngineeringStudent(String name , int age , double cgpa){
        super(name , age);
        this.cgpa=cgpa;
    }   
    
    void attendLab(){
        System.out.println("Lab Attended By Student "+name);
    }
}

class CSEengineeringStudent extends EngineeringStudent{  // Class D
    
    CSEengineeringStudent(String name , int age , double cgpa){
        super(name , age , cgpa);
    }

    void codingAssignment(){
        System.out.println("Coding Assignment Done By "+name);
    }
}

class DataScienceStudent extends EngineeringStudent{  // Class E
    
    DataScienceStudent(String name , int age , double cgpa){
        super(name , age , cgpa);
    }

    void modelTraining(){
        System.out.println("Model Trained By Student "+name);
    }
}


class MedicalStudent extends Student{  // Class C
    
    int patientsObserved;

    MedicalStudent(String name , int age , int patientsObserved){
        super(name , age);
        this.patientsObserved = patientsObserved;
    }
    
    void visitpatent(){
        System.out.println("Patent Observed By Student "+name);
    }
}

class SurgeryStudent extends MedicalStudent{   // Class F
    
    SurgeryStudent(String name , int age , int patientsObserved){
        super(name , age , patientsObserved);
    }

    void performSurgery(){
        System.out.println("Surgery Practiced By Student " + name);
    }
}

class PharmacyStudent extends MedicalStudent{   // Class G
    
    PharmacyStudent(String name , int age , int patientsObserved){
        super(name , age , patientsObserved);
    }

    void prepareMedicine(){
        System.out.println("Medicine Prepared By Student " + name);
    }
}




public class hierarchical {
    public static void main(String [] args){
        
    }    
}
