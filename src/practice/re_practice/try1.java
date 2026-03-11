package practice.re_practice;

import java.util.Vector;

public class try1 {
    public static void main(String [] args){
        Vector<Integer> v1 = new Vector<>();
        v1.add(10);
        System.out.println(v1);
        StringBuffer sb = new StringBuffer("Hello");
        sb.append('r');
        sb.insert(0,'p');
        sb.reverse();
        System.out.println(sb);
    }
}
