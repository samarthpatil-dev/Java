package Object_Orientied_Programming;

class c_over{
    public
    c_over(int x){
        System.out.println(x);
    }
    c_over(double x){
        System.out.println(x);
    }
    c_over(char x){
        System.out.println(x);
    }
    }


public class constructor_overloading {
    public static void main(String[] args) {
    c_over obj = new c_over(32.31);
    c_over obj1 = new c_over('c');
    }
}


