package BasicsOfJava;
import java.util.Scanner;
public class sum_of_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = a+b;
        System.out.println("Addition of two number : "+result);
    }
}
