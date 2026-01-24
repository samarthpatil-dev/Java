package packages.iopackages;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class taskdo {
    public static void main(String [] args)throws Exception{
        FileOutputStream f1 = new FileOutputStream("abc.txt");
        String message = "Hello Java From File i/o";
        f1.write(message.getBytes());
        System.out.println("Message Successfully Written");
        FileInputStream f2 = new FileInputStream("abc.txt");
        int data;
        byte [] store = new byte[100];
        data = f2.read(store);
        String Information = new String(store,0,data);
        System.out.println(Information);
    }
}
