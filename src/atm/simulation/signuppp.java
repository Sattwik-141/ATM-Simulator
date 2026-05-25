package atm.simulation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signuppp extends JFrame implements ActionListener {
    JRadioButton b1,b2,b3,b4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton sub1,can1;
    String formnum;
    signuppp( String formnum)
    {
        this.formnum=formnum;

       // super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank3.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);



        JLabel label2=new JLabel("Account Details:");
        label2.setFont(new Font("Arial",Font.BOLD,22));
        label2.setBounds(320,50,600,25);
        add(label2);

        JLabel label3=new JLabel("Account Type:");
        label3.setFont(new Font("Arial",Font.BOLD,20));
        label3.setBounds(150,140,275,25);
        add(label3);

        b1=new JRadioButton("Savings");
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setBounds(300,145,100,20);
        b1.setBackground(new Color(200, 220, 240));
        add(b1);

        b2=new JRadioButton("Fixed Deposit");
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setBounds(500,145,150,20);
        b2.setBackground(new Color(200, 220, 240));
        add(b2);

        b3=new JRadioButton("Current");
        b3.setFont(new Font("Arial",Font.BOLD,14));
        b3.setBounds(300,180,100,20);
        b3.setBackground(new Color(200, 220, 240));
        add(b3);

        b4=new JRadioButton("Recurring Deposit");
        b4.setFont(new Font("Arial",Font.BOLD,14));
        b4.setBounds(500,180,150,20);
        b4.setBackground(new Color(200, 220, 240));
        add(b4);

        ButtonGroup buttonGroup1= new ButtonGroup();
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        buttonGroup1.add(b3);
        buttonGroup1.add(b4);

        JLabel label4=new JLabel("Account Number:       XXXX-XXXX-XXXX-1491");
        label4.setFont(new Font("Arial",Font.BOLD,20));
        label4.setBounds(120,210,450,25);
        add(label4);

        JLabel label5=new JLabel("PIN:       XXXX");
        label5.setFont(new Font("Arial",Font.BOLD,20));
        label5.setBounds(247,250,275,25);
        add(label5);

        JLabel label6=new JLabel("(4-Digit Password)");
        label6.setFont(new Font("Arial",Font.BOLD,12));
        label6.setBounds(182,270,275,25);
        add(label6);

        JLabel label7=new JLabel("Services Required:");
        label7.setFont(new Font("Arial",Font.BOLD,20));
        label7.setBounds(108,300,275,25);
        add(label7);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(200,220,240));
        c1.setFont(new Font("Arial",Font.BOLD,16));
        c1.setBounds(150,340,110,30);
        add(c1);

        c2 = new JCheckBox("INTERNET BANKING");
        c2.setBackground(new Color(200,220,240));
        c2.setFont(new Font("Arial",Font.BOLD,16));
        c2.setBounds(370,340,200,30);
        add(c2);

        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(new Color(200,220,240));
        c3.setFont(new Font("Arial",Font.BOLD,16));
        c3.setBounds(150,390,200,30);
        add(c3);

        c4 = new JCheckBox("EMAIL notify");
        c4.setBackground(new Color(200,220,240));
        c4.setFont(new Font("Arial",Font.BOLD,16));
        c4.setBounds(370,390,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(200,220,240));
        c5.setFont(new Font("Arial",Font.BOLD,16));
        c5.setBounds(150,440,200,30);
        add(c5);

        c6 = new JCheckBox("E-STATEMENT");
        c6.setBackground(new Color(200,220,240));
        c6.setFont(new Font("Arial",Font.BOLD,16));
        c6.setBounds(370,440,200,30);
        add(c6);

        c7= new JCheckBox("I hereby declare that the above entered details as of now is correct.");
        c7.setBackground(new Color(200,220,240));
        c7.setFont(new Font("Arial",Font.BOLD,16));
        c7.setBounds(100,510,600,30);
        add(c7);

        JLabel label11= new JLabel("Form no.:");
        label11.setFont(new Font("Arial",Font.BOLD,18));
        label11.setBounds(300,10,275,23);
        add(label11);

        JLabel label13= new JLabel(formnum);
        label13.setFont(new Font("Arial",Font.BOLD,18));
        label13.setBounds(410,9,60,30);
        add(label13);

        sub1=new JButton("SUBMIT");
        sub1.setFont(new Font("Arial",Font.BOLD,14));
       sub1.setBackground(Color.BLACK);
       sub1.setForeground(Color.white);
        sub1.setBounds(220,570,100,25);
        sub1.addActionListener(this);
        add(sub1);

        can1=new JButton("CANCEL");
        can1.setFont(new Font("Arial",Font.BOLD,14));
        can1.setBackground(Color.BLACK);
        can1.setForeground(Color.white);
        can1.setBounds(500,570,100,25);
        can1.addActionListener(this);
        add(can1);




        JLabel label1=new JLabel("PAGE 3");
        label1.setFont(new Font("Arial",Font.BOLD,12));
        label1.setBounds(400,600,60,30);
        add(label1);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(200,220,240));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype=null;
        if (b1.isSelected()){
            atype = "Saving Account";
        } else if (b2.isSelected()) {
            atype ="Fixed Deposit Account";
        }else if (b3.isSelected()){
            atype ="Current Account";
        }else if (b4.isSelected()){
            atype = "Recurring Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac = fac+"ATM CARD ";
        } else if (c2.isSelected()) {
            fac = fac+"Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac+"Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac+"EMAIL Notify";
        } else if (c5.isSelected()) {
            fac=fac+"Cheque Book";
        } else if (c6.isSelected()) {
            fac=fac+"E-Statement";
        }

        try {
            if (e.getSource()==sub1){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    connec c1 = new connec();
                    String q1 = "insert into signup3 values('"+formnum+"', '"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formnum+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                   new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==can1) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
    new signuppp("");
    }
}
