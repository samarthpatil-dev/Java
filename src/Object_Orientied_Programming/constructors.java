package Object_Orientied_Programming;

class Calculation{
    private
    int a,b,c;
    public
    Calculation(int a,int b){
        this.a = a;
        this.b = b;
    }
    void cal(){
     c = a + b;
    }
    void show(){
        System.out.println("Addition = "+c);
    }
}

public class constructors {
    public static void main(String[] args) {
        Calculation c1 = new Calculation(10,20);
        c1.cal();
        c1.show();
    }
}


