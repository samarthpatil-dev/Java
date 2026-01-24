package Functions;
import java.util.Scanner;
public class table {
    public static void Table(){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Be Multiplied");
        number = sc.nextInt();
        for (int i = 1;i<10;i++){
            System.out.println(number + "x"+ i+'='+number * i);
        }
    }

    public static void main(String[] args) {
        Table();
    }
}
