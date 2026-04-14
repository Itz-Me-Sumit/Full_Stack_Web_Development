import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Hash_set_Methods {
    public static void main(String[] args){
        // Constructor of HashSet / LinkedHashSet
        Set<Integer> set = new HashSet<>();
        
        // Initial Capacity
        Set<Integer> set2 = new HashSet<>(100);

        /*
        -> Initial Capacity , Load Factor

        dekho Initial capacity matlab set me kitne elements reh sakte hai... and Load Factor jo ki decial me rahega maan lo 0.8 to eska matlab hai ki agar set 80% fill ho jaye tab hame set ki capacity ko badha dena hai aur wo badh ke double ho jati hai..
        */

        Set<Integer> set3 = new HashSet<>(100 , 0.8f);

        // Usinf another collection
        Set<Integer> set4 = new HashSet<>(List.of(1,2,3,4,5,6,7));


    }   
}
