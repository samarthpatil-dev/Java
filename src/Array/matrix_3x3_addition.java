package Array;
import java.util.Scanner;
public class matrix_3x3_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a = new int [3][3];
        int [][] b = new int [3][3];
        int [][] c = new int [3][3];
        System.out.println("Enter Elements For Matrix 1");
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Elements For Matrix 2");
        for (int i = 0;i<3;i++){
            for (int j = 0;j< 3;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Addition of Array Element is");
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                System.out.print(c[i][j]+""+"\t");
            }
            System.out.println();
        }
    }
}
