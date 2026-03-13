public class constructor_chaining {
    static  class Student{
        
        // Instance Variable
        public String name;
        public int age;
        public int rollNum;
        public String college;
        
        // Instance Methods
        void markAttendence(){
            System.out.println("Attendence Marked For Student " + name);
        }
        
        void studentDetails(){
            if(name != "Unknown")     System.out.println("Name: "    + name);
            if(age != 0)         System.out.println("Age: "     + age);
            if(rollNum != 0)     System.out.println("RollNum: " + rollNum);
            if(college != "Unknown")  System.out.println("College: " + college + "\n");
        }

        Student(){
            this("Unknown");
            System.out.println("First Constructor");
        }

        Student(String name){
            this(name , 0);
            System.out.println("Second Constructor");
        }

        Student(String name , int age){
            this(name , age , 0);
            System.out.println("Third Constructor");
        }

        Student(String name , int age , int rollNum){
            this(name , age , rollNum , "Unknown");
            System.out.println("Fourth Constructor");
        }

        Student(String name , int age , int rollNum , String college){
            this.name=name;
            this.age=age;
            this.rollNum=rollNum;
            this.college=college;
        }

    }

    public static void main(String [] args){

        
        Student s1 = new Student(); 
        s1.studentDetails();

        Student s2 = new Student("Sumit");
        s2.studentDetails();

    }
}
