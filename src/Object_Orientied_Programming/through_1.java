package Object_Orientied_Programming;
import java.util.Scanner;
class calculation{
   private
   int a,b,c;
   public
      void get_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    void cal(){
          c = a + b;
    }
    void show(){
        System.out.println("Addition = "+c);
    }
}
public class through_1 {
    public static void main(String[] args) {
        calculation c1 = new calculation();
        c1.get_data();
        c1.cal();
        c1.show();

    }
}
