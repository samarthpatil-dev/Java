package packages.util_package;

import java.util.ArrayList;
import java.util.Vector;

public class collections {
    public static void main(String [] args){
        ArrayList<Integer> v1 = new ArrayList<>();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.remove(0);
        System.out.println(v1);
    }
}
