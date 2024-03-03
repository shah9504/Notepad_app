
package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    About()
    {
        setBounds(400,100,600,500);
        setLayout(null);
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("Downloads/Notepad.png"));
        Image i2=il.getImage().getScaledInstance(300,60,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel headerIcon=new JLabel(il);
        headerIcon.setBounds(70,40,400,80);
        add(headerIcon);
        JLabel text=new JLabel("<html>Learn about notepad app<br>Version 0.1.0(OS build Java)<br> All rights reserved</html>");
        text.setBounds(150,100,500,300);
        add(text);
        
        JButton b1=new JButton("OK");
        b1.setBounds(150,350,120,25);
        b1.addActionListener(this);
        add(b1);
        
        
    setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
    
    this.setVisible(false);
    }
    
    public static void main(String[] args )
    {
    new About();
    }
}
