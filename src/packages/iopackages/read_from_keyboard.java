package packages.iopackages;

import java.io.InputStreamReader;

public class read_from_keyboard {
    public static void main(String [] args) throws Exception{
        InputStreamReader i1 = new InputStreamReader(System.in);
        int ch = i1.read();
        System.out.println((char) ch);
    }
}
