package BasicsOfJava;
import java.util.Scanner;
public class modulus {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend");
        int a = sc.nextInt();
        System.out.println("Enter Divisor");
        int b = sc.nextInt();
        System.out.println("When Dividend  "+a+" Divided by "+b+" Result = "+(a%b));
    }
}
