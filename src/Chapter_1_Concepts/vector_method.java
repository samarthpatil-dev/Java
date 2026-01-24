package Chapter_1_Concepts;

import java.util.Vector;

public class vector_method {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(20);
        v.add(50);
        v.remove(0);
        System.out.println(v);
    }
}
