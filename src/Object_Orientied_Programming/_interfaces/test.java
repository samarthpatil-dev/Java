package Object_Orientied_Programming._interfaces;

public class test {
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.eat();
        Cat c1 = new Cat();
        c1.eat();
        System.out.println(Dogs.max_age);
        Animal.info();
        c1.Running();
        d1.Running();
    }
}
