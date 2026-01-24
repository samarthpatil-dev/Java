package Conditionals;
import java.util.Scanner;
public class problem_3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter The Numbers");
        num = sc.nextInt();
        if (num < 0){
            System.out.println("The Absolute Number is "+-num);
        }
        else{
            System.out.println("The Absolute Number is "+num);
        }
    }
}
