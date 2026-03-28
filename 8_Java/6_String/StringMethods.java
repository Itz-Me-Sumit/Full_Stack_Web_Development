public class StringMethods {
    public static void main(String [] args){
        String s1 = new String("Sumit");
        String s2 = new String("SUMIT");
        String s5 = new String("AbcAbcAbc");

        // Length / Emptyness

        System.out.println(s1.length());
        System.out.println(s1.isEmpty()); // Is String length = 0?
        System.out.println(s1.isBlank()); // Dose String have any char?

        // Character Access
        char [] chararr = s1.toCharArray(); // {'S','u','m','i','t'}


        //Comparison
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        String s3 = new String("abc");
        String s4 = new String("abd");

        System.out.println(s3.compareTo(s4)); //-1
        System.out.println(s1.contains("Sum")); //true
        System.out.println(s1.indexOf('u')); //1
        System.out.println(s5.lastIndexOf("A")); //6
        System.out.println(s5.lastIndexOf("bc")); //7
        System.out.println(s1.startsWith("Su")); //true
        System.out.println(s1.endsWith("it")); // true


        // Extraction / Transformation
        System.out.println(s2.substring(2,4));
        System.out.println(s2.substring(3));

        String s6 = new String("LeaRnINg JaVA");
        System.out.println(s6.toUpperCase());
        System.out.println(s6.toLowerCase());

        String s7 = new String("     Triming White Spaces   ");
        System.out.println(s7.trim());
        System.out.println(s7.strip()); // unicode Friendly

        System.out.println(s2.replace('M' , 'I'));
        System.out.println(s2.replace("IT" , "MM"));
        System.out.println(s5.replaceAll("Abc" , "Pqr"));

        String s8 = "Sumit , Shivam , Shiva";
        String[] arr2 = s8.split(",");
        for(String c : arr2){
            System.out.println(c.strip());
        }

        String JoinString = String.join("-" , "a","b","C","D");
        System.out.println(JoinString);

        String joinArr = String.join("-" , arr2);
        System.out.println(joinArr);


        // Advance --> intern() , format()

        String s9 = new String("Hello");
        String s10 = s9.intern(); // s9 ko copy karo and sting pool me daal do agar stringpool me pehle se "Hello" na ho and s10 string pool wale "Hello" ko point kar rha hoga

        System.out.println(s9 == s10);

        String name = "Sumit";
        int age = 20;
        System.out.println(String.format("Hello %s , your age is %s" , name , age));



    }
}
