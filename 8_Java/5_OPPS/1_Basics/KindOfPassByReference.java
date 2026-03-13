public class KindOfPassByReference {
    
    static class random{   
        int a;
        int b;

        // Constructor
        random(int a , int b){
            this.a = a;
            this.b = b;
        }

    }

    static void addTen(random r){
        r.a = r.a + 10;
        r.b = r.b + 10;

        System.out.println(r.a + " " + r.b);

    }

    public static void main(String[] args){
        random r1 = new random(5,10);
        addTen(r1);
    }

}
