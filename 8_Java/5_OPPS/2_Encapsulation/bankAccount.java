class bank_Account{

    private double balance;

    public void deposite(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
    }

    public void getBalance(){
        System.out.println(balance);
    }

    

}


public class bankAccount {
    public static void main(String [] args){

    }
}