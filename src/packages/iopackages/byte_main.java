package packages.iopackages;

import java.io.FileInputStream;

public class byte_main {
    public static void main(String [] args) throws Exception{
        FileInputStream f1 = new FileInputStream("samarth.txt");
        byte [] arr = new byte[100];
        int read = f1.read(arr);
        String text = new String(arr,0,read);
        System.out.println(text);
        f1.close();
    }
}
