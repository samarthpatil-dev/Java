package practice;

class calculation{
    protected int a;
    protected int b;
    void cal(){}
}

class addition extends calculation{

    @Override
    void cal(){
        a = 10;
        b = 20;
        System.out.println("Addition = "+(a+b));
    }
}

class subtraction extends calculation{
    @Override
    void cal(){
        a = 30;
        b = 50;
        System.out.println("Subtraction = "+(a-b));
    }
}

public class Main{
    public static void main(String [] args){
        calculation c1;
        addition a1 = new addition();
        subtraction s1 = new subtraction();
        c1 = a1;
        c1.cal();
        c1 = s1;
        c1.cal();
    }
}