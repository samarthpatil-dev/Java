package awt_swing_packages;
import java.awt.*;

public class panel_class {
    public static void main(String[] args) {
        Frame f = new Frame("Panel Example");
        Panel p = new Panel();
        p.setBounds(100,200,100,300);
        Button b1 = new Button("ok");
        Button b2 = new Button("cancel");

        p.add(b1);
        p.add(b2);

        f.add(p);

        f.setSize(300,200);
        f.setVisible(true);
    }
}
