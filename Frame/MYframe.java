package Frame;

import java.awt.Color;

import javax.swing.JFrame;

public class MYframe extends JFrame{

    MYframe(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,500);
        this.setResizable(true);
        this.getContentPane().setBackground(Color.CYAN);
    }

}
