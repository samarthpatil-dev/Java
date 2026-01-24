package packages.iopackages;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class file_output_stream {
    public static void main(String [] args) throws Exception{
        FileOutputStream f1 = new FileOutputStream("samarth.txt");
        String data = "Hello Java";
        f1.write(data.getBytes());
        f1.close();
        System.out.println("Data Written Successfully");
        FileInputStream f2 = new FileInputStream("samarth.txt");
        int store;
        byte [] info = new byte[100];
        store = f2.read(info);
        String read1 = new String(info,0,store);
        System.out.println(read1
        );
        System.out.println("Data Read Successfully");
    }
}
