package packages.iopackages;

import java.io.BufferedReader;
import java.io.FileReader;

public class buffer_reader {
    public static void main(String [] args) throws Exception {
        BufferedReader b1 = new BufferedReader( new FileReader("samarth.txt"));
        String line;
        while (true){
            line = b1.readLine();
            if (line == null){
                break;
            }
            System.out.println(line);
        }
        b1.close();
    }
}
