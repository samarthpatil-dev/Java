package Conditionals;
import java.util.Scanner;
public class if_elseif_else {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter Two Numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            System.out.println("A is Greater");
        }
        else if (a < b){
            System.out.println("B is Greater");
        }
    }
}
