package Loops;
import java.util.Scanner;

public class _1ton {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        num = sc.nextInt();
        for (int i = 1;i<=num;i++){
            System.out.println(i);
        }
    }
}
