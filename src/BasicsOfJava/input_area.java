package BasicsOfJava;
import java.util.Scanner;
public class input_area {
    public static void main(String [] args){
       System.out.println("Enter Radius");
       Scanner sc = new Scanner(System.in);
       double radius = sc.nextDouble();
       double pi = 3.14;
       double area = (pi * radius * radius);
       System.out.println("area = "+area);
    }
}
