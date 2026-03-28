interface Payment{
    void pay();
}

class debitCard implements Payment{
    public void pay(){
        System.out.println("Pay via Debit Card");
    }
}

class creditCard implements Payment{
    public void pay(){
        System.out.println("Pay via Credit Card");
    }
}


public class PaymentInterface {
    public static void main(String[] args){
        Payment debitcard = new debitCard();
        Payment creditCard = new creditCard();

        debitcard.pay();
        creditCard.pay();

    }    
}
