package Object_Orientied_Programming;
import java.util.Scanner;

class Table{
    private
    int number;
    public
    void get_data(){
        System.out.println("Enter The Number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
    }
    void show_table(){
        for (int i = 1;i<=10;i++){
            System.out.println(number + "X" + i + "=" + (number*i));
        }
    }
}


public class print_table {
    public static void main(String[] args) {
        Table t1 = new Table();
        t1.get_data();
        t1.show_table();
    }
}
