package Functions;
import java.util.Scanner;
public class square {
    public static int squ(int number){
        return number*number;
    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        number = sc.nextInt();
        System.out.println("Square = "+squ(number));
    }
}
