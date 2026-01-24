package Conditionals;
import java.util.Scanner;
public class Homework_3 {
    public static void main(String [] args){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("The Number Is Divisible By 3");
        }
        if (number % 5 == 0 && number % 3 != 0){
            System.out.println("The Number Is Divisible by 5 not by 3");
        }
    }
}
