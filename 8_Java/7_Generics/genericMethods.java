

public class genericMethods {
    public static void main(String[] args){

        String s = getResult("Sumit");
        Integer i = getResult(10);
        System.out.println(s + "\n" + i);


        printPari("Sumit" ,10); // Type Inference

    }    

    public static <T> T getResult(T X){
        return X;
    }

    public static <T,U> void printPari(T first , U second){
        System.out.println(first + " " + second);
    }

}
