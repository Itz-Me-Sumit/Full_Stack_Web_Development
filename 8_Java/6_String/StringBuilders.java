public class StringBuilders {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        
        // append()
        sb.append("Sumit");
        sb.append("Kumar");
        System.out.println(sb);

        // insert()
        sb.insert(2 , 'o');
        System.out.println(sb);

        // delete()
        sb.delete(0,2);
        System.out.println(sb);

        //deleteCharAt()
        sb.deleteCharAt(2);
        System.out.println(sb);

        // replace()
        sb.replace(1,3 ,"Xy");
        System.out.println(sb);

        // reverse()
        sb.reverse();
        System.out.println(sb);

        // charAt()
        System.out.println(sb.charAt(1));

        // setCharAt()
        sb.setCharAt(2,'r');
        System.out.println(sb);

        //length
        System.out.println(sb.length());

        //capacty
        System.out.println(sb.capacity());

        // ensureCapacity
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        // trimToSize
        sb.trimToSize();
        System.out.println(sb.capacity());


    }
}
