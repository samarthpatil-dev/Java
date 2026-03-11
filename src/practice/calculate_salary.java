package practice;

class employee12{
    protected float salary = 30000;
}

class Manager extends employee12{
    void calculate(){
        int hra = 3000;
        int da = 2000;
        float total_salary = hra+da+salary;
        System.out.println("Total Salary = "+total_salary);
    }
}
public class calculate_salary {
    public static void main(String [] args){
        Manager m1 = new Manager();
        m1.calculate();
    }
}
