public class constructor {

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
            if(name != null)     System.out.println("Name: "    + name);
            if(age != 0)         System.out.println("Age: "     + age);
            if(rollNum != 0)     System.out.println("RollNum: " + rollNum);
            if(college != null)  System.out.println("College: " + college + "\n");
        }

        // Constructor

            // Default Constructor
            Student(){
                this("Unknown" , 0 , 0 , "Unknown");
            }

            // Parameterize Constructor

            

            Student (String name , int age , int rollNum , String college){
                this.name=name;
                this.age=age;
                this.rollNum=rollNum;
                this.college=college;
            }

        // Calling One Constructor form Another Constructor.
        
        Student(String name){
            this(name , 0, 0 , "Unknown");
            // esme maine eske just uper wale constructor ko call kiya hai !!
        }

        Student(String name , int age){
            this(name , age , 0 , "Unknown");
        }

        Student(String name , int age , int rollNum){
            this(name , age , rollNum , "Unknown");
        }


    }

    public static void main(String [] args){

        
        Student s1 = new Student("Sumit" , 21 , 1002 , "IIT Madras");

        s1.markAttendence();
        s1.studentDetails();

        Student s2 = new Student("Shivam");
        s2.studentDetails();

        Student s3 = new Student("Samrat" ,23);
        s3.studentDetails();

        Student s4 = new Student("Shivang" , 43 , 2020);
        s4.studentDetails();

    }    
}
