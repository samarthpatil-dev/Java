package practice.re_practice;

abstract class s1{
    abstract void getdata();
}

class s2 extends s1{
    @Override
    void getdata() {
        System.out.println("Hello World");
    }
}
public class abstract_try {
    public static void main(String [] args){
        s2 obj = new s2();
        obj.getdata();
    }
}
