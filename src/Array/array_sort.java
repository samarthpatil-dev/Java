package Array;
import java.util.Scanner;
public class array_sort {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int [] arr = new int [6];
   int i,j,temp;
        System.out.println("Enter The Array Elements");
        for (i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted Array");
        for (i = 0;i<arr.length;i++){
            for (j = 0;j<arr.length-1;j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
