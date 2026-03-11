package awt_swing_packages;
import java.awt.*;

public class checkboxes_example {
    public static void main(String[] args) {
        Frame f1 = new Frame("Checkbox");
        Panel p1 = new Panel();
        p1.setBounds(40,80,200,200);
        p1.setBackground(Color.red);
        Checkbox c1,c2;
        CheckboxGroup cbg = new CheckboxGroup();

        c1 = new Checkbox("java",cbg,false);
        c2 = new Checkbox("Python",cbg,false);
        c1.setBounds(100,100,50,50);
        c2.setBounds(100,200,50,50);
        p1.add(c1);
        p1.add(c2);
        f1.add(p1);
        f1.setSize(300,300);
        f1.setVisible(true);
    }
}
