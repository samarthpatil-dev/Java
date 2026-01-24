package Object_Orientied_Programming;

class f_over{
    public
    void show(int x){
        System.out.println(x);
    }
    void show(double x){
        System.out.println(x);
    }
    void show(char x){
        System.out.println(x);
    }
}

public class function_overloading {
    public static void main(String[] args) {
        f_over obj = new f_over();
        obj.show(23);
        obj.show(32.23);
    }
}
