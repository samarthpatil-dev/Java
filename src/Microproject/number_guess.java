package Microproject;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class number_guess {

    public static void main(String[] args) {

        Frame f = new Frame("Number Guess Game");
        f.setSize(400,300);
        f.setLayout(null);

        Random r = new Random();
        int number = r.nextInt(50) + 1;

        final int chances[] = {8};

        Label l1 = new Label("Enter Number:");
        l1.setBounds(50,80,100,30);
        f.add(l1);

        TextField t1 = new TextField();
        t1.setBounds(160,80,100,30);
        f.add(t1);

        Button b1 = new Button("Guess");
        b1.setBounds(150,130,80,30);
        f.add(b1);

        Label result = new Label("");
        result.setBounds(120,180,200,30);
        f.add(result);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int guess = Integer.parseInt(t1.getText());
                chances[0]--;

                if(guess == number)
                    result.setText("Correct!");
                else if(chances[0] == 0)
                    result.setText("Game Over! Number: " + number);
                else if(guess > number)
                    result.setText("Too High!");
                else
                    result.setText("Too Low!");
            }
        });

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        f.setVisible(true);
    }
}