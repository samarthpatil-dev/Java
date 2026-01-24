package Object_Orientied_Programming.Encapsulation;
import java.util.Scanner;

public class test {
    private long account_number;
    private String account_name;
    private float balance;
    private int age;
    test(int account_number,String account_name,float balance,int age){
        this.account_name = account_name;
        this.account_number = account_number;
        this.age = age;
        this.balance = balance;
    }
    void show_account(){
        System.out.println("Account Number = "+account_number);
        System.out.println("Name = "+account_name);
        System.out.println("Age = "+age);
        System.out.println("Balance = "+balance);
    }
    void change_info(){
        System.out.println("Enter Choice To Change In Details");
        System.out.println("1.Name 2.Age");
        int choice;String New_Name;int new_age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice");
        choice = sc.nextInt();
        if (choice == 1){
            System.out.println("Enter The Name");
            New_Name = sc.next();
            if (New_Name.contentEquals(account_name)){
                System.out.println("Enter The Valid new Name");
                return;
            }
            else {
                account_name = New_Name;
            }
        }
        else{
            System.out.println("Enter New Age");
            new_age = sc.nextInt();
            if (new_age == age){
                return;
            }
            else {
                age = new_age;
            }
        }
    }

}

