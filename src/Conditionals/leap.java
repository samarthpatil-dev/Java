package Conditionals;
import java.util.Scanner;
public class leap {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter The Year");
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The Year is Leap");
        }
        else {
            System.out.println("Not A Leap Year");
        }
    }
}
