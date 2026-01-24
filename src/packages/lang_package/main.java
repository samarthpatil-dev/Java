package packages.lang_package;
import  java.lang.Math;

public class main {
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        int largest = Math.max(a,b);
        System.out.println("Largest = "+largest);
        double d = Math.sqrt(a);
        System.out.println("sqrt 10 = "+d);
        double square = Math.pow(a,2);
        System.out.println("10 Square is "+square);
        System.out.println(Math.abs(-1000));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.ceil(10.5321));
        System.out.println(Math.round(10.43434));
        System.out.println(Math.floorDiv(10,9));
    }
}
