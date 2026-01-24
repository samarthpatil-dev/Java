package Chapter_1_Concepts;

class s1{
     public void p1(){
        System.out.println("P1 Is Running");
        p2();
    }
     public void p2(){
        System.out.println("P2 Is Running Calling Inside P1");
    }
}
public class Nested_Methods {
    public static void main(String[] args) {
        s1 obj1 = new s1();
        obj1.p1();
    }
}
