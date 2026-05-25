package atm.simulation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_body extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2,b3,b4,b5,b6,b7;
    main_body (String pin)
    {
        this.pin=pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm7.png"));
        //ImageIcon i1 = new ImageIcon(getClass().getResource("/atm7.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1=new JLabel("Select your transaction:");
        label1.setBounds(470,180,700,35);
        label1.setForeground(Color.white);
        label1.setFont(new Font("Arial",Font.BOLD,28));
        image.add(label1);

        b1=new JButton("DEPOSIT");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(200,220,240));
        b1.setBounds(407,272,120,30);
        b1.addActionListener(this);
        image.add(b1);

        b2=new JButton("WITHDRAWAL");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(200,220,240));
        b2.setBounds(695,272,160,30);
        b2.addActionListener(this);
        image.add(b2);

//        b3=new JButton("FAST CASH");
//        b3.setForeground(Color.white);
//        b3.setBackground(new Color(200,220,240));
//        b3.setBounds(407,322,120,30);
//        b3.addActionListener(this);
//        image.add(b3);

//        b4=new JButton("MINI STATEMENT");
//        b4.setForeground(Color.white);
//        b4.setBackground(new Color(200,220,240));
//        b4.setBounds(695,322,160,30);
//        b4.addActionListener(this);
//        image.add(b4);

//        b5 = new JButton("PIN CHANGE");
//        b5.setForeground(Color.WHITE);
//        b5.setBackground(new Color(200,220,240));
//        b5.setBounds(410,362,120,35);
//        b5.addActionListener(this);
//        image.add(b5);

        b6 = new JButton("BALANCE ");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(200,220,240));
        b6.setBounds(695,362,160,35);
        b6.addActionListener(this);
        image.add(b6);

        b7 = new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.red);
        b7.setBounds(535,406,150,35);
        b7.addActionListener(this);
        image.add(b7);




        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==b1) {
            new Deposit(pin);
            setVisible(false);


        }
        else if(e.getSource()==b2)
        {
            new withdrawal(pin);
            setVisible(false);
        }
        else if(e.getSource()==b6)
        {
            new balanceEnquiry(pin);
            setVisible(false);
        }
//        else if(e.getSource()==b5)
//        {
//            new Pin(pin);
//        }
        else if(e.getSource()==b7)
        {
            System.exit(1);
            setVisible(false);//frame-off but not program/code
            new main_body(pin);//exits
        }
    }

    public static void main(String [] args)
    {
        new main_body("");
    }
}
