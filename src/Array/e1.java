package Array;
import java.util.Scanner;
public class e1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter 5 Array Elements");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Entered Elements Are");
        for (int j = 0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
