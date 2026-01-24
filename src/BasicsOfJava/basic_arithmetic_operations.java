package BasicsOfJava;
import java.util.Scanner;
public class basic_arithmetic_operations {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Two Numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        System.out.println("Result = "+c);
    }
}
