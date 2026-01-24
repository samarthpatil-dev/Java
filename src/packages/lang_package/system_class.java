package packages.lang_package;
import java.lang.System;
import java.util.Scanner;

public class system_class {
    public static void main(String [] args){
        String Name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name:\n");
        Name = sc.next();
        if (Name.matches(".*\\d.*")){
            System.out.println("Name shouldn't contain Digits");
            System.exit(0);
        }
    }
}
