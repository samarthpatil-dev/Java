package Chapter_1_Concepts;

public class Wrapper_Class {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = new Integer(num); // boxing
        Integer num2 = num; // autoboxing

        int num3 = num1.intValue();  // unboxing

        System.out.println(num2);
        System.out.println(num3);

    }
}
