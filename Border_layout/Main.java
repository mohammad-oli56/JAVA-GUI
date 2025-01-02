package Border_layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        //<-----------Super Panal--------------

        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        JPanel panel_3 = new JPanel();
        JPanel panel_4 = new JPanel();
        JPanel panel_5 = new JPanel();

        panel_1.setBackground(Color.RED);
        panel_2.setBackground(Color.GREEN);
        panel_3.setBackground(Color.YELLOW);
        panel_4.setBackground(Color.MAGENTA);
        panel_5.setBackground(Color.BLUE);
        
        panel_1.setPreferredSize(new Dimension(100,100));
        panel_2.setPreferredSize(new Dimension(100,100));
        panel_3.setPreferredSize(new Dimension(100,100));
        panel_4.setPreferredSize(new Dimension(100,100));
        panel_5.setPreferredSize(new Dimension(100,100));

        //<----------Sub Panal----------------

        JPanel panel_6 = new JPanel();
        JPanel panel_7 = new JPanel();
        JPanel panel_8 = new JPanel();
        JPanel panel_9 = new JPanel();
        JPanel panel_10 = new JPanel();

        panel_6.setBackground(Color.BLACK);
        panel_7.setBackground(Color.LIGHT_GRAY);
        panel_8.setBackground(Color.GRAY);
        panel_9.setBackground(Color.LIGHT_GRAY);
        panel_10.setBackground(Color.WHITE);

        panel_1.setLayout(new BorderLayout(2,3));
        
        panel_6.setPreferredSize(new Dimension(50,50));
        panel_7.setPreferredSize(new Dimension(50,50));
        panel_8.setPreferredSize(new Dimension(50,50));
        panel_9.setPreferredSize(new Dimension(50,50));
        panel_10.setPreferredSize(new Dimension(50,50));

        panel_1.add(panel_6,BorderLayout.SOUTH);
        panel_1.add(panel_7,BorderLayout.WEST);
        panel_1.add(panel_8,BorderLayout.NORTH);
        panel_1.add(panel_9,BorderLayout.EAST);
        panel_1.add(panel_10,BorderLayout.CENTER);

         //<--------Frame-------->

         frame.setVisible(true);
         frame.setSize(540, 640);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(new BorderLayout(5,5));

         //----------Add----------
         
         frame.add(panel_1,BorderLayout.CENTER);
         frame.add(panel_2,BorderLayout.SOUTH);
         frame.add(panel_3,BorderLayout.NORTH);
         frame.add(panel_4,BorderLayout.EAST);
         frame.add(panel_5,BorderLayout.WEST);

    }
}
