package Chapter_1_Concepts;
import java.util.Scanner;
public class String_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(2));
        System.out.println(name.equals("samarth"));
        System.out.println(name.concat(" co"));
    }
}
