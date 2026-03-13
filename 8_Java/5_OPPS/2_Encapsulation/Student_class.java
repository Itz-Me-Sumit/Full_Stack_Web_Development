class student{
    private String name;
    private int marks;
    private int rollNum;
    private String college;

    student(String name , int marks , int rollNum , String college){
        this.name=name;
        this.marks=marks;
        this.rollNum=rollNum;
        this.college=college;
    }

    void studentInfo(){
        System.out.println(name+"\n"+marks+"\n"+rollNum+"\n"+college);
    }


    public String getName(){
        return name;
    }

    int getMarks(){
        return marks;
    }

    int getRollNum(){
        return rollNum;
    }

    String getCollegeName(){
        return college;
    }

    void setName(String name){
        this.name=name;
    }

    void setMarks(int marks){
        this.marks=marks;
    }

    void setRollNum(int rollNum){
        this.rollNum=rollNum;
    }

    void setCollege(String college){
        this.college=college;
    }

}

public class Student_class {
    public static void main(String [] args){
        student s1 = new student("Sumit" , 21 , 2101 , "IIT Madras");

        s1.studentInfo();

        System.out.println("\nStudent Marks: "+s1.getMarks());
        System.out.println("\nStudent College: "+s1.getCollegeName());

        System.out.println("\nStudent name: "+s1.getName());
        s1.setName("Shivam");
        System.out.println("\nStudent name: "+s1.getName());

    }
}
