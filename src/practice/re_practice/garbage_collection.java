package practice.re_practice;

class run{
    protected void finalize(){
        System.out.println("Garbage Collector Called");
    }
}
public class garbage_collection {
    public static void main(String [] args){
        int a;
        run run1 = new run();
        run1.finalize();
    }
}
