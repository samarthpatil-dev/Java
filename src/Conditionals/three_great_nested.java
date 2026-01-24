package Conditionals;
import java.util.Scanner;
public class three_great_nested {
    public static void main(String [] args){
   int number1,number2,number3, greatest;
   Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        if (number1 > number2) {
            if (number1 > number3) {
                greatest = number1;
            } else {
                greatest = number3;
            }
        } else {
            if (number2 > number3) {
                greatest = number2;
            } else {
                greatest = number3;
            }
        }
        System.out.println("THe Greatest Number is "+greatest);
    }
}
