package Object_Orientied_Programming;
import java.util.Scanner;

class CollegeDetails {
    private String college_name;
    private String college_id;
    public void get_college_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter College Name and Id");
        college_id = sc.next();
        college_name = sc.next();
    }
    public void show_college_details(){
        System.out.println("College Name = " + college_name + " | College Id = " + college_id);
    }
}

class DepartmentDetails extends CollegeDetails {
    private String dept_name;
    private String dept_id;
    public void get_dept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dept Name and Id");
        dept_name = sc.next();
        dept_id = sc.next();
    }
    public void show_dept(){
        System.out.println("Dept Id = " + dept_id + " | Dept Name = " + dept_name);
    }
}

class StudentDetails extends DepartmentDetails {
    private String student_name;
    private String student_id;
    public void get_student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name and Id");
        student_id = sc.next();
        student_name = sc.next();
    }
    public void show_students(){
        System.out.println("Student Name = " + student_name + " | Student Id = " + student_id);
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        s1.get_student();
        s1.get_dept();
        s1.get_college_details();

        System.out.println("\n--- Details ---");
        s1.show_students();
        s1.show_dept();
        s1.show_college_details();
    }
}
