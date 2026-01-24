package Object_Orientied_Programming.Abstract_class;
import java.util.Scanner;
abstract class atm{
    abstract void withdraw();
    abstract void check_balance();

    void insert_card(){
        System.out.println("Card Inserted");
    }

    void enter_pin(){
        System.out.println("Pin Inserted");
    }
}
class sbi extends atm{
    private float balance = 5000;
    private float amount;
    Scanner sc = new Scanner(System.in);
    @Override
    void withdraw() {
        System.out.println("Enter Amount");
        amount = sc.nextInt();
        if (amount < 500 || amount >= balance){
            System.out.println("Minimum 500 Withdrawal");
        }
        else {
            balance -= amount;
            System.out.println("withdraw Successful "+balance);
        }
    }
    @Override
    void check_balance() {
        System.out.println(balance);
    }
}
public class d2 {
    public static void main(String[] args) {
        sbi s1 = new sbi();
        s1.insert_card();
        s1.enter_pin();
        s1.withdraw();
        s1.check_balance();
    }
}

