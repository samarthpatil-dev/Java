package Conditionals;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
public class three_largest {
    public static void main(String [] args){
        int a,b,c;int greater;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && a > c){
            greater = a;
        }
        else if (b > a && b > c) {
            greater = b;
        }
        else{
            greater = c;
        }
        System.out.println("The Greater Is "+greater);
    }
}
