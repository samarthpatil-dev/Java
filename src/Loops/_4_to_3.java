package Loops;
import java.util.Scanner;

public class _4_to_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N");
        int n = sc.nextInt();

        int term = 4;

        for (int i = 1; i <= n; i++) {
            System.out.println(term);
            term += 3;
        }
    }
}
