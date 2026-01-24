package Conditionals.Short_Hand_If_Else;
import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marks;
        marks = sc.nextFloat();
        String Result = (marks >= 40)?"Pass":"Fail";
        System.out.println(Result);
    }
}
