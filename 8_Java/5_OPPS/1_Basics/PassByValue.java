// Call By reference Java me hoti hi nahi
// Only Call By Value hoti hai

public class PassByValue {

    static void addTen(int a , int b){
        a+=10;
        b+=10;
    }

    public static void main(String [] args){
        int a=10;
        int b=10;
        System.out.println(a+" "+b);
        
        addTen(a,b);
        System.out.println(a+" "+b);

    }

}