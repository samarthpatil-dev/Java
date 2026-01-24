package Object_Orientied_Programming._interfaces;

public interface Animal {
     void eat();
     int max_age = 30;

     public static void info(){
         System.out.println("This is Animal Interface");
     };

     public default void Running(){
         System.out.println("Animal is Running");
     }
}
