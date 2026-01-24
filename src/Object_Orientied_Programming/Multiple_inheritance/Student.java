package Object_Orientied_Programming.Multiple_inheritance;
import java.util.Scanner;
public class Student implements College,department{
    public String c_name;
    public String c_id;
    public String dept_id;
    public String dept_name;
    public String student_name;
    public String student_id;
    Scanner sc = new Scanner(System.in);
    @Override
    public void get_college() {
        System.out.println("Enter College Id and Name");
        c_id = sc.next();
        c_name = sc.next();
    }

    @Override
    public void show_college() {
        System.out.println("College id "+c_id+" College Name = "+c_name);
    }

    @Override
    public void get_dept() {
        System.out.println("Enter The dept id and dept name");
        dept_id = sc.next();
        dept_name = sc.next();
    }

    @Override
    public void show_dept() {
        System.out.println("Dept id = "+dept_id+" Dept name "+dept_name);
    }

    void get_student(){
        System.out.println("Enter Student Id and Student Name");
        student_id = sc.next();
        student_name = sc.next();
    }

    void show_student(){
        System.out.println("Student id  = "+student_id+" Student Name = "+student_name);
    }
}
