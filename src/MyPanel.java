import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class MyPanel extends JPanel {
        public static void main(String[] args) {
            JFrame frame  = new JFrame ("Simple Frame");
            frame.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE );
            frame.setSize(300, 120);
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();

            JLabel l = new JLabel ("Label1 ");
            JTextField tf = new JTextField("TextField1");
            panel1.add(l);
            panel1.add(tf);
            panel1.setLayout(new FlowLayout());

            JButton b1 = new JButton("Button 1");
            JButton b2 = new JButton("Button 2");
            JButton b3 = new JButton("Button 3");
            panel2.add(b1);
            panel2.add(b2);
            panel2.add(b3);
            JPanel p = new JPanel();
            p.add(panel1);
            p.add(panel2);
            p.setLayout(new BoxLayout(p, BoxLayout. Y_AXIS ));
            frame.setContentPane(p);
            frame.setVisible(true);


            b1.addActionListener(new ActionListener() {
                Integer a = 0;
                @Override
                public void actionPerformed(ActionEvent e) {

                    a++;
                    l.setText(Integer.toString(a));
                }
            });

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Scanner in = new Scanner(System.in);
                    String userString = in.nextLine();
                    tf.setText(userString);
                    l.setText(tf.getText());
                }
            });

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Random random = new Random();
                    float r1 = random.nextFloat();
                    float g1 = random.nextFloat();
                    float b1 = random.nextFloat();
                    Color randomColor1 = new Color(r1,g1,b1);
                    float r2 = random.nextFloat();
                    float g2 = random.nextFloat();
                    float b2 = random.nextFloat();
                    Color randomColor2 = new Color(r2,g2,b2);

                    panel1.setBackground(randomColor1);
                    panel2.setBackground(randomColor2);
                }
            });

        }
}


