package atm.simulation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balanceEnquiry extends JFrame implements ActionListener {
    JLabel label2;
    JButton b1,b2;
    String pin;
    balanceEnquiry(String pin)
    {
        this.pin=pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm7.png"));
        //ImageIcon i1 = new ImageIcon(getClass().getResource("/atm7.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("CURRENT BALANCE:");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 18));
        label1.setBounds(520,180,700,35);
        image.add(label1);//add label 1 over image not frame.

        label2 = new JLabel("");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 18));
        label2.setBounds(520,220,400,35);
        image.add(label2);

        b1=new JButton("BACK");
        b1.setForeground(Color.red);
        b1.setBounds(700,406,150,35);
        b1.addActionListener(this);
        image.add(b1);

        int balance=0;
        try
        {
            connec c1=new connec();
            ResultSet resultSet=c1.statement.executeQuery("Select * from bank where pin ='"+pin+"' ");
            while(resultSet.next())
            {
                if(resultSet.getString("type").equals("Deposit"))
                {
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }
                else {
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }
        label2.setText(""+balance);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
//        getContentPane().setBackground(new Color(200,220,240));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_body(pin);
    }

    public static void main(String [] args)
    {
        new balanceEnquiry("");
    }
}
