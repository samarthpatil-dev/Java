package Conditionals.Short_Hand_If_Else;
import java.util.Scanner;
public class example_4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age");
    int age = sc.nextInt();
    String vote = (age > 18) ? "Can Vote" : "Cannot Vote";
        System.out.println(vote);
    }
}
