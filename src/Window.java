import java.awt.Font;
import java.awt.event.*;  
import javax.swing.*;
import java.awt.Image;

public class Window extends JFrame{
     int i = 1;
    public Window(){
        
    }  
    public void test(){
        JFrame test = new JFrame("Button Example");
        JTextField tf1 = new JTextField();  
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\William Z\\Pictures\\Saved Pictures\\580b57fbd9996e24bc43c0fc.png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        JButton testButton = new JButton(imageIcon);

        tf1.setOpaque(false);
        tf1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        tf2.setOpaque(false);
        tf2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        tf3.setOpaque(false);
        tf3.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        testButton.setBounds(50,100,150,150);
        testButton.setOpaque(false);
        testButton.setContentAreaFilled(false);
        testButton.setBorderPainted(false);
        
        tf1.setBounds(50,50, 250,20);
        tf2.setBounds(96, 87, 235, 35);
        tf2.setText("CLICK ME!!");
        tf3.setBounds(200, 100, 170, 180);
        tf3.setFont(new Font("SansSerif", Font.PLAIN, 100));
        
        test.setLayout(null); 
        test.setSize(400, 400);

        test.add(testButton);
        test.add(tf1);
        test.add(tf2);
        test.add(tf3);
        
        
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);

        testButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        tf1.setText("You have clicked the button " + i + " times!"); 
                        i++;
                        if(i > 20){
                            tf3.setText("✭");
                            SwingUtilities.updateComponentTreeUI(test);
                        }
                        if(i > 50){
                            tf3.setText("✭✭");
                            SwingUtilities.updateComponentTreeUI(test);
                        }
                    }  
                });
    }
}
//🂡