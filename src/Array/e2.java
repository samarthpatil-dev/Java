package Array;
import java.util.Scanner;
public class e2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        int [] arr = new int[5];
        System.out.println("Enter The Elements");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max Element = "+max);
    }
}
