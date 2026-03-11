package practice;
import java.util.Scanner;

interface salary {
    float basic_salary = 40000;
}

 class employee {
    Scanner sc = new Scanner(System.in);
    protected String name = "pratik";
    protected int age = 17;

    void show(){
        System.out.println("Name = "+name+"Age = "+age);
    }
}


class employee1 extends employee implements salary{

    void display(){
        System.out.println("Name = "+name+"Age = "+age+"Salary = "+basic_salary);
    }
}