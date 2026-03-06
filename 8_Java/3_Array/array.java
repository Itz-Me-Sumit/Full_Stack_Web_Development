public class array {
    public static void main (String[] arga){
        int [] arr = {1,2,3,4,5};
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(i);
        }
        System.out.println();
        int [] arr2 = new int[5];
        for(int i=0 ; i< arr2.length ; i++){
            arr2[i] = arr[i];
            System.out.println(arr2[i]);
        }

    } 
}
