package Chapter_1_Concepts;

class Demo {

    public void finalize(){
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj = null;

        System.gc(); // Request GC
        System.out.println("End of program");
    }
}
