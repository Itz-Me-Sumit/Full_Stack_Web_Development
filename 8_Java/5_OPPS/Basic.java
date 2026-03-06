public class Basic{
    
    static class Student{

        
        
        public String name;
        public int age;
        public int rollNum;
        public String college;

        int attendence = 0;
        void markAttendence(){
            attendence+=1;
        }    
            
        void printStudent(Student s){
            System.out.println(s.name + "\n " + s.age + "\n" + s.rollNum + "\n" + s.college);
        }

    }
    
    public static void main(String[] args){

        Student s1 = new Student();
        s1.name="Sumit";
        s1.age=21;
        s1.rollNum=1002;
        s1.college="IIT Madras";

        s1.printStudent(s1);


        Student s2 = new Student();
        s2.name="Shivam";
        s2.age=16;
        s2.rollNum=1003;
        s2.college="IIM Ahemdabad";
        
        s2.printStudent(s2);

    }

}