public class StaticKeyword {
    static class learnStatic{
        String name;
        int age;
        int rollNumber;
        static String college; 
        static String collegeAddress;
        
        static{ // Used to initlize all static variable
            college = "IIT Madras";
            collegeAddress = "Chinnai Madras";
        }


        /*
            dekho maan lo abb sare students same college hai hai to ham jitni baar object banayenge utni bar college ke liye storage dena parega to ham college ko static kar dete hai jisse stack me esko alag se store kar liya jayega and jab bhi koi object banayega to usme college us stack me pare college name ko point kar raha hoga that's it

            that's why ye college aab object ki property na hoke class ki property ho gai hai.
        
            */


        learnStatic(String name , int age , int rollNumber){
            this.name=name;
            this.age=age;
            this.rollNumber=rollNumber;
        }

        void print(){
            System.out.println(name+"\n"+age+"\n"+rollNumber+"\n"+college+"\n"+collegeAddress);
        }

    }


    public static void main(String [] args){

        learnStatic lS1 = new learnStatic("Sumit" , 21 , 221 );
        lS1.print();

    }
}
