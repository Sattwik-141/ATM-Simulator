package atm.simulation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawal extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2;
    JTextField textField;
    withdrawal (String pin)
    {
        this.pin=pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm7.png"));
        //ImageIcon i1 = new ImageIcon(getClass().getResource("/atm7.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS 20,000.");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460,180,700,35);
        image.add(label1);//add label 1 over image not frame.

        JLabel label2 = new JLabel("ENTER YOUR AMOUNT:");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(460,220,400,35);
        image.add(label2);

        textField = new JTextField();
        textField.setBackground(new Color(200,220,240));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        image.add(textField);



        b1=new JButton("WITHDRAW");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(200,220,240));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(200,220,240));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        image.add(b2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
//        getContentPane().setBackground(new Color(200,220,240));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    connec c1 = new connec();
                    //executeupdate query for inserting data in the table. and for extracting executequery
                    int balance = 0;
                    //to check where data comes/stores inside resultset
                    ResultSet resultSet = c1.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Bank balance.");
                        return;
                    }
                    c1.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawal', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_body(pin);
                }
            } catch (Exception E) {
                //throw new RuntimeException(ex);
            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new main_body(pin);
        }
    }

    public static void main(String [] args)
    {
        new withdrawal("");
    }
}
