import java.util.Scanner;

public class scanner_class {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        Double weight = sc.nextDouble();
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
    }    
}
