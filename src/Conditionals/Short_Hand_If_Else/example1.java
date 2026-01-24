package Conditionals.Short_Hand_If_Else;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter Two Number");
        a = sc.nextInt();b = sc.nextInt();
        int max = (a > b)?a:b;
        System.out.println(max);
    }
}
