package Functions;
import java.util.Scanner;
public class print_add {
    public static void sum(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Two Number");
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println(c);
    }
    public static void main(String [] args){
        sum();
    }
}
