package awt_swing_packages;
import java.awt.*;

public class frame_example {
    public static void main(String [] args){
        Frame f = new Frame();
        Label lb = new Label("Hello");
        Label lb1 = new Label("World");
        lb.setBounds(50,50,100,100);
        lb1.setBounds(60,100,30,50);
        f.add(lb);
        f.add(lb1);
        f.setSize(300,300);
        f.setVisible(true);
    }
}
