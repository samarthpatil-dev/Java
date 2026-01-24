package packages.iopackages;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class char_read {
    public static void main(String [] args) throws Exception{
        FileInputStream f1 = new FileInputStream("samarth.txt");
        InputStreamReader i1 = new InputStreamReader(f1);
        int ch;
        while (true){
            ch = i1.read();
            if (ch == -1){
                break;
            }
            System.out.println((char) ch);
        }
    }
}
