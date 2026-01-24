package Object_Orientied_Programming;

class Student{
    int id;
    String Name;
}
public class first {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 23;
        s1.Name = "Samarth";
        System.out.println(s1.id);
        System.out.println(s1.Name);
    }
}
