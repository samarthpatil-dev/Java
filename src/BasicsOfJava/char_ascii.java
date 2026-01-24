package BasicsOfJava;
import java.util.Scanner;
public class char_ascii {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        System.out.println("Ascii of Char is "+ch+"  "+(int)ch);
    }
}
