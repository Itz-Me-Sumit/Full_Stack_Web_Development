class studentClass{
    String name;
    int age;
    void markAttendence(){
        System.out.println("Attendence Marked By Student "+name);
    }

    // studentClass(String name , int age){
    //     this.name=name;
    //     this.age=age;
    // }

}

class engineeringStudent  extends studentClass{
    void attendLab(){
        System.out.println("Lab Attended By Student "+name);
    }
}


public class student {
    public static void main(String [] args){
        engineeringStudent eS1 = new engineeringStudent();
        eS1.markAttendence();
        eS1.attendLab();
    }    
}
