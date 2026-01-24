package Conditionals;
import java.util.Scanner;
public class nested_if {
    public static void main(String [] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        num = sc.nextInt();
        if (num % 5 == 0){
            if (num % 3 == 0){
                System.out.println("The Number is Divisible by 5 and 3");
            }
        }
        else{
            System.out.println("The Number is Not Divisible by 5 and 3");
        }
    }
}
