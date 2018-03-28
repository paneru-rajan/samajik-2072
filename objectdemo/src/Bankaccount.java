public class Bankaccount {
    int accountno;
    String name;
    float ammount;
void insert(int a,String n,float amt){
    accountno=a;
    name=n;
    ammount=amt;
}
void deposit(float amt){
    ammount=ammount+amt;
    System.out.println(amt+ " deposited! ");
}
void withdraw(float amt){
    if(ammount<amt) {
        System.out.println("Insufficient ammount!");
    }
    else
        {
        ammount=ammount-amt;
        System.out.println(amt+"withdrawn");
    }}
    void checkbalance()
    {
        System.out.println("balance is "+ammount);
    }
    void display(){
        System.out.println(accountno+" "+name+" "+ammount);
    }

}

class testaccount{
    public static void main(String[] args) {
        Bankaccount a1 = new Bankaccount();
        a1.insert(111, "David", 433000);
       a1.display();
       a1.checkbalance();
       a1.deposit(2999);
       a1.checkbalance();
       a1.withdraw(5000);
       a1.checkbalance();
    }
}