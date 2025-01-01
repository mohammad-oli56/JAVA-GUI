package Button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{

    JButton button = new JButton();
    JLabel label = new JLabel();

   
    MyFrame(){
        ImageIcon icon = new ImageIcon("Button/download.png");
        ImageIcon icon_1 =new ImageIcon("Button/images.jpeg");

        label.setIcon(icon_1);
        label.setBounds(120,420,226,226);
        label.setVisible(false);

        button.setBounds(100, 100, 300, 220);
        button.addActionListener((ActionListener) this);
        button.setText("I am butto");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,50));
        button.setIconTextGap(-5);
        button.setForeground(Color.MAGENTA);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(520,750);
        this.setResizable(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.CYAN);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==button){
        //System.out.println("pop");
       // button.setEnabled(false);
       label.setVisible(true);

     }


    }

}
