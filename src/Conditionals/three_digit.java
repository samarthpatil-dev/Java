package Conditionals;
import java.util.Scanner;
public class three_digit {
    public static void main(String [] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numbers");
        num = sc.nextInt();
        if (num >= 100){
            System.out.println("The Entered Number is Three Digit");
        }
        else{
            System.out.println("The Entered Number is Two Digit");
        }
    }
}
