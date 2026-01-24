package BasicsOfJava;
import java.util.Scanner;

public class char_datatype {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        ch = sc.next().charAt(7);
        System.out.println("Name = "+ch);
    }
}
