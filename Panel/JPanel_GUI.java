package Panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanel_GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        JLabel label_1 = new JLabel();
        label_1.setFont(new Font("MV Boli",Font.ITALIC,50));
        label_1.setText("HI");
        label_1.setHorizontalAlignment(JLabel.CENTER);
      // label_1.setBounds(90, 20, 100, 60);

        JLabel label_2 = new JLabel();
        label_2.setFont(new Font("MV Boli",Font.ITALIC,50));
        label_2.setText("OLI");
        label_2.setHorizontalAlignment(JLabel.CENTER);

        JLabel label_3 = new JLabel();
        label_3.setFont(new Font("MV Boli",Font.ITALIC,50));
        label_3.setText("HOW ARE U");
        label_3.setHorizontalAlignment(JLabel.CENTER);

        
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 0, 250, 250);
        redpanel.setLayout(new BorderLayout());
       // redpanel.setLayout(null);


        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250, 0, 250, 250);
        bluepanel.setLayout(new BorderLayout());

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(0, 250, 500, 250);
        greenpanel.setLayout(new BorderLayout());

        frame.setSize(720,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(redpanel);
        redpanel.add(label_1);

        frame.add(bluepanel);
        bluepanel.add(label_2);

        frame.add(greenpanel);
        greenpanel.add(label_3);
    }
}
