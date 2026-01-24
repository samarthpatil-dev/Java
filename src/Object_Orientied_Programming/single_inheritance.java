package Object_Orientied_Programming;
import java.util.Scanner;

class Department {
    private int deptno;
    private String dept_name;

    public void getDeptData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dept No:");
        deptno = sc.nextInt();
        System.out.println("Enter Department Name:");
        dept_name = sc.next();
    }

    public void showDeptData() {
        System.out.println("Dept No = " + deptno + " | Dept Name = " + dept_name);
    }
}

class Students extends Department {
    private int rollno;
    private String name;

    public void getStudentData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll No:");
        rollno = sc.nextInt();
        System.out.println("Enter Student Name:");
        name = sc.next();
    }

    public void showStudentData() {
        System.out.println("Roll No = " + rollno + " | Name = " + name);
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        Students s1 = new Students();

        s1.getDeptData();
        s1.getStudentData();

        System.out.println("\n--- Student Information ---");
        s1.showDeptData();
        s1.showStudentData();
    }
}

