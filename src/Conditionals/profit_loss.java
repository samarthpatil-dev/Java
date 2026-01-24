package Conditionals;
import java.util.Scanner;
public class profit_loss {
    public static void main(String [] args){
        float current_price,selling_price,price;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Current Price");
        current_price = sc.nextFloat();
        System.out.println("Enter The Selling Price");
        selling_price = sc.nextFloat();
        if (selling_price>current_price){
            price = selling_price-current_price;
            System.out.println("Total Profit = "+price);
        }
        else if(current_price == selling_price){
            System.out.println("The Profit = 0");
        }
        else{
            price = current_price-selling_price;
            System.out.println("Total Loss = "+price);
        }
    }
}

