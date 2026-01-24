package Conditionals;
import java.util.Scanner;
public class divisible_by_5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the Number");
        a = sc.nextInt();
        if (a%5 == 0){
            System.out.println("The Number Is divisible by 5");
        }
        else{
            System.out.println("The Number is Not Divisible by 5");
        }
    }
}
