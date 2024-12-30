package Label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLabel_GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("Label/download.jpeg");
        Border border = BorderFactory.createLineBorder(Color.GREEN,4);

        
        
        //-----------LABEL----------
        label.setText("Hello world!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.BLUE);
        label.setIconTextGap(10);
        label.setFont(new Font("MV Boli",Font.ITALIC,50));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(50, 120, 250, 250);
        
        
        //--------FRAME----------
        // frame.setSize(420,500);
        //frame.setLayout(null);
        frame.add(label);
        frame.setResizable(true);
        frame.setTitle("This is Java Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
    
}
