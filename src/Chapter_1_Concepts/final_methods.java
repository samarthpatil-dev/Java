package Chapter_1_Concepts;
class A{
    public final void calc(){
        System.out.println("This Is Final");
    }
}
class B extends A{
    public final void calc2(){
        System.out.println("This is Final 2");
    }
}

public class final_methods {
    public static void main(String[] args) {
        B b1 = new B();
        b1.calc2();
        b1.calc();
    }
}
