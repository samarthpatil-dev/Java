package Conditionals.Short_Hand_If_Else;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter The Number");
        number = sc.nextInt();
        int abs = (number < 0) ? -number:number;
        System.out.println(abs);
    }

}
