package GridLayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,3,3));;

        for(int i=1;i<=9;i++){
              
                frame.add(new JButton(String.valueOf(i)));
        }

        frame.setVisible(true);
    }
}
