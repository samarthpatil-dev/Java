package awt_swing_packages;
import java.awt.*;

public class button_try {
    public static void main(String[] args) {
        Frame f = new Frame();
        Panel p = new Panel();
        p.setBounds(40,80,200,200);
        p.setBackground(Color.black);
        Button b1 = new Button("ok");
        b1.setBounds(50,50,50,50);
        Button b2 = new Button("Cancel");
        b2.setBounds(150,50,100,50);
        p.add(b1);
        p.add(b2);
        f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
    }
}
