package awt_swing_packages;
import java.awt.*;

public class label_example {
    public static void main(String [] args){
        Frame f = new Frame("Frame Example");
        Panel p = new Panel();
        p.setBounds(40,80,200,200);
        p.setBackground(Color.gray);
        Label l1 = new Label("Label1");
        Label l2 = new Label("Label2");
        Label l3 = new Label("Label3");
        l1.setBounds(50,50,100,100);
        l2.setBounds(150,50,100,100);
        l3.setBounds(250,50,100,100);
        p.add(l1);
        p.add(l2);
        p.add(l3);
        f.add(p);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
