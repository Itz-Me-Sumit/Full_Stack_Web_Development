class pair <T> { 
    T first;
    T second;

    pair (T first , T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }

    public T getSecond(){
        return this.second;
    }

    public void getPair(){
        System.out.println(getFirst());
        System.out.println(getSecond());
    }

}

class distinctPair <T , U> {
    T first;
    U second;

    distinctPair (T first , U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }

    public U getSecond(){
        return this.second;
    }

    public void getPair(){
        System.out.println(getFirst());
        System.out.println(getSecond());
    }

}

public class PairGeneric {
    public static void main(String[] args){
        pair<String> p1 = new pair<String>("Sumit" , "Sumit");
        p1.getPair();

        pair<Integer> p2 = new pair<Integer>(10 , 20);
        p2.getPair();


        distinctPair<String , Integer> ds1 = new distinctPair<String , Integer> ("Sumit" , 20);
        ds1.getPair();

    }    
}
