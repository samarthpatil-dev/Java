package Loops;
import java.util.Scanner;

public class ap_to_n {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(num);
            num += 2;
        }
    }
}
