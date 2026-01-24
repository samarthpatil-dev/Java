package Object_Orientied_Programming.Polymorphism;
import java.util.Scanner;

class calculation{
    Scanner sc = new Scanner(System.in);
    protected int a;
    protected int b;
    void getdata(){
        System.out.println("Enter The Two Number");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    public void cal(){
    }
}
class add extends calculation{
    @Override
    public void cal() {
        System.out.println("Addition = "+(a+b));
    }
}

class cube extends calculation{
    @Override
    public void cal() {
        System.out.println(a+" cube = "+(a*a*a));
        System.out.println(b+" cube = "+(b*b*b));
    }
}

public class ex {
    public static void main(String[] args) {
        calculation c1 = new add();
        c1.getdata();
        c1.cal();
        calculation c2 = new cube();
        c2.getdata();
        c2.cal();
    }
}
