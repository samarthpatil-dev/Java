package Microproject;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class number_guess {

    static Label msg = new Label("Pick a difficulty!", Label.CENTER);
    static TextField input = new TextField(10);
    static int num, chances, max;
    static int[][] cfg = {{20,8},{50,7},{100,6}};
    static Color BG = Color.black, ACCENT = Color.cyan, TEXT = Color.white;
    static Color GREEN = Color.green, RED = Color.red;

    public static void main(String[] args) {
        Frame f = new Frame("Number Guess Game");
        f.setSize(420, 320);
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 22));
        f.setBackground(BG);

        Label title = new Label("Number Guess Game", Label.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        title.setForeground(ACCENT);
        f.add(title);

        Label sub = new Label("Select Difficulty", Label.CENTER);
        sub.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        sub.setForeground(TEXT);
        f.add(sub);

        String[] names = {"Easy", "Medium", "Hard"};
        Color[] colors = {GREEN, ACCENT, RED};
        for (int i = 0; i < 3; i++) {
            Button b = new Button(names[i]);
            b.setFont(new Font("Segoe UI", Font.BOLD, 13));
            b.setBackground(colors[i]);
            b.setForeground(BG);
            b.setPreferredSize(new Dimension(90, 32));
            final int idx = i;
            b.addActionListener(e -> startLevel(idx));
            f.add(b);
        }

        msg.setFont(new Font("Segoe UI", Font.BOLD, 13));
        msg.setForeground(TEXT);
        msg.setPreferredSize(new Dimension(360, 24));
        f.add(msg);

        input.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        input.setBackground(Color.darkGray);
        input.setForeground(TEXT);
        input.setPreferredSize(new Dimension(160, 32));
        f.add(input);
        Button guess = new Button("Guess");
        guess.setFont(new Font("Segoe UI", Font.BOLD, 13));
        guess.setBackground(ACCENT);
        guess.setForeground(BG);
        guess.setPreferredSize(new Dimension(120, 32));
        guess.addActionListener(e -> play());
        input.addActionListener(e -> play());
        f.add(guess);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    static void startLevel(int i) {
        max = cfg[i][0]; chances = cfg[i][1];
        num = new Random().nextInt(max) + 1;
        input.setText("");
        setMsg("Guess 1 to " + max + " | Chances: " + chances, TEXT);
    }

    static void setMsg(String text, Color color) {
        msg.setText(text);
        msg.setForeground(color);
    }

    static void play() {
        if (max == 0) { setMsg("Select a difficulty first!", RED); return; }
        try {
            int g = Integer.parseInt(input.getText().trim());
            if      (g < 1 || g > max)  setMsg("Enter between 1 and " + max, RED);
            else if (g == num)          { setMsg("Correct! You Win!", GREEN); max = 0; }
            else if (--chances == 0)    { setMsg("Game Over! Number was: " + num, RED); max = 0; }
            else setMsg((g > num ? "Too High!" : "Too Low!") + " Chances left: " + chances, ACCENT);
        } catch (Exception e) { setMsg("Enter a valid number!", RED); }
        input.setText("");
    }
}