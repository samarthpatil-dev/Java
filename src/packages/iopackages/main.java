package packages.iopackages;
import java.io.FileInputStream;

public class main {
    public static void main(String [] args) throws Exception{
        FileInputStream fis = new FileInputStream("samarth.txt");
        int data;
        while (true){
            data = fis.read();
            if (data == -1){
                break;
            }
            System.out.println((char) data);
        }
        fis.close();
    }
}
