package atm.simulation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class loginpage extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordfield3;
    JButton button1,button2,button3;
    loginpage()
    {
    super("ATM simulation system");
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank3.png"));
    Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(350,10,100,100);
    add(image);

    ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
    Image i22=i11.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
    ImageIcon i33=new ImageIcon(i22);
    JLabel iimage = new JLabel(i33);
    iimage.setBounds(650,350,100,100);
    add(iimage);

    label1= new JLabel("WELCOME TO ATM");
    label1.setForeground(Color.white);
    label1.setFont(new Font("AvantGarde",Font.BOLD,30));
    label1.setBounds(255,125,500,40);
    add(label1);

    label2=new JLabel("Account NO. :");
    label2.setFont(new Font("AvantGarde",Font.BOLD,26));
    label2.setForeground(Color.white);
    label2.setBounds(150,190,375,30);
    add(label2);

    textField2=new JTextField(15);
    textField2.setBounds(325,190,230,30);
    textField2.setForeground(Color.black);
    textField2.setFont(new Font("Arial",Font.BOLD,14));
    add(textField2);

    label3=new JLabel("PIN :");
    label3.setFont(new Font("AvantGarde",Font.BOLD,26));
    label3.setForeground(Color.white);
    label3.setBounds(150,240,375,40);
    add(label3);

    passwordfield3=new JPasswordField(12);
    passwordfield3.setBounds(325,250,230,30);
    passwordfield3.setForeground(Color.black);
    passwordfield3.setFont(new Font("Arial",Font.BOLD,14));
    add(passwordfield3);

    button1=new JButton("SIGN IN");
    button1.setFont(new Font("Arial",Font.BOLD,14));
    button1.setForeground(Color.black);
    button1.setBounds(150,340,100,30);
    button1.addActionListener(this);
    add(button1);

    button2=new JButton("CLEAR");
    button2.setFont(new Font("Arial",Font.BOLD,14));
    button2.setForeground(Color.red);
    button2.setBackground(Color.white);
    button2.setBounds(320,340,90,30);
    button2.addActionListener(this);
    add(button2);

    button3=new JButton("SIGN UP");
    button3.setFont(new Font("Arial",Font.BOLD,14));
    button3.setForeground(Color.black);
    button3.setBounds(470,340,100,30);
    button3.addActionListener(this);
    add(button3);

    ImageIcon i111=new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
    Image i222=i111.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
    ImageIcon i333=new ImageIcon(i222);
    JLabel iiimage = new JLabel(i333);
    iiimage.setBounds(0,0,850,480);
    add(iiimage);


    setLayout(null);
    setSize(850,480);
    setLocation(450,200);
    //setUndecorated(true); removes the minimize,maximize,close window bar.
    setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
    try{
        if (e.getSource() == button1) {
            connec c1=new connec();
            String cardno= textField2.getText();
            String pin= passwordfield3.getText();
            String q="select * from login where card_num = '"+cardno+"' and pin='"+pin+"'";
            ResultSet resultSet=c1.statement.executeQuery(q);
            if(resultSet.next())
            {
                setVisible(false);
                new main_body(pin);
            }
            else {
                JOptionPane.showMessageDialog(null,"Incorrect Account number and pin");
            }
        }
        else if(e.getSource()==button2)
        {
            textField2.setText("");
            passwordfield3.setText("");
        } else if (e.getSource()==button3) {
            new Signup();
            setVisible(false);
        }
    } catch (Exception E) {
        {
           // E.printStackTrace();
            throw new RuntimeException(E);
        }
    }
    }
    public static void main(String[] args)
    {
        new loginpage();

    }
}
