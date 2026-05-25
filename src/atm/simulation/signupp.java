package atm.simulation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class signupp extends JFrame implements ActionListener {
    String formnum;
    JComboBox<String> comboBox,comboBox1,comboBox2,comboBox3,comboBox4;
    JTextField textpan,textad;
    JRadioButton b1,b2;
    JButton next;
    signupp(String first)
    {
        this.formnum= first;
        //("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank3.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);



        JLabel label1=new JLabel("ADDITIONAL DETAILS:");
        label1.setFont(new Font("Arial",Font.BOLD,20));
        label1.setBounds(300,50,600,25);
        add(label1);

        JLabel label3=new JLabel("Religion:");
        label3.setFont(new Font("Arial",Font.BOLD,20));
        label3.setBounds(150,140,275,25);
        add(label3);

        String[] religion ={"Hindu","Christian","Sikh","Muslim","Others"};
         comboBox = new JComboBox<>(religion);
        comboBox.setBackground(new Color(152,251,152));
        comboBox.setFont(new Font("Arial",Font.BOLD,14));
        comboBox.setBounds(290,140,200,25);
        add(comboBox);

        JLabel label4=new JLabel("Caste:");
        label4.setFont(new Font("Arial",Font.BOLD,20));
        label4.setBounds(173,200,275,25);
        add(label4);


        String[] caste ={"General","OBC","GEN-EWS","SC","ST","Others"};
        comboBox1 = new JComboBox<>(caste);
        comboBox1.setBackground(new Color(152,251,152));
        comboBox1.setFont(new Font("Arial",Font.BOLD,14));
        comboBox1.setBounds(290,200,200,25);
        add(comboBox1);

        JLabel label5=new JLabel("Income status:");
        label5.setFont(new Font("Arial",Font.BOLD,20));
        label5.setBounds(95,248,275,25);
        add(label5);

        String[] inc ={"Below 1,00,000","1,00,000-5,00,000","5,00,000-10,00,000","Above 10,00,000","No"};
         comboBox2 = new JComboBox<>(inc);
        comboBox2.setBackground(new Color(152,251,152));
        comboBox2.setFont(new Font("Arial",Font.BOLD,14));
        comboBox2.setBounds(290,248,200,25);
        add(comboBox2);

        JLabel label6=new JLabel("Education:");
        label6.setBounds(135,298,275,25);
        label6.setFont(new Font("Arial",Font.BOLD,20));
        add(label6);

        String[] edu= {"Secondary(10)","Higher secondary(10+2)","Diploma","Under-graduate","Post-graduate","Ph.D","Others"};
       comboBox3=new JComboBox<>(edu);
        comboBox3.setBackground(new Color(152,251,152));
        comboBox3.setFont(new Font("Arial",Font.BOLD,14));
        comboBox3.setBounds(290,298,200,25);
        add(comboBox3);

        JLabel label7= new JLabel("Occupation:");
        label7.setFont(new Font("Arial",Font.BOLD,20));
        label7.setBounds(122,342,275,25);
        add(label7);

        String[] occ= {"Job","Self-Employed","Business","Student","Unemployed","Other"};
         comboBox4=new JComboBox<>(occ);
        comboBox4.setBackground(new Color(152,251,152));
        comboBox4.setFont(new Font("Arial",Font.BOLD,14));
        comboBox4.setBounds(290,342,200,25);
        add(comboBox4);

        JLabel label8= new JLabel("PAN No.:");
        label8.setFont(new Font("Arial",Font.BOLD,18));
        label8.setBounds(159,392,275,23);
        add(label8);

        textpan=new JTextField();
        textpan.setFont(new Font("Arial",Font.BOLD,14));
        textpan.setBounds(290,392,200,23);
        textpan.setBackground(new Color(152,251,152));
        add(textpan);

        JLabel label9= new JLabel("Adhaar No.:");
        label9.setFont(new Font("Arial",Font.BOLD,18));
        label9.setBounds(140,440,275,23);
        add(label9);

        textad=new JTextField();
        textad.setFont(new Font("Arial",Font.BOLD,14));
        textad.setBounds(290,440,200,23);
        textad.setBackground(new Color(152,251,152));
        add(textad);

        JLabel label10= new JLabel("Are you Senior citizen? :");
        label10.setFont(new Font("Arial",Font.BOLD,18));
        label10.setBounds(30,498,275,23);
        add(label10);

        b1=new JRadioButton("Yes");
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setBounds(290,498,100,20);
        b1.setBackground(new Color(200, 220, 240));
        add(b1);

        b2=new JRadioButton("No");
        b2.setBounds(390,498,100,20);
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setBackground(new Color(200, 220, 240));
        add(b2);

        ButtonGroup buttonGroup1= new ButtonGroup();
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);

        JLabel label11= new JLabel("Form no.:");
        label11.setFont(new Font("Arial",Font.BOLD,18));
        label11.setBounds(300,10,275,23);
        add(label11);

        JLabel label13= new JLabel(formnum);
        label13.setFont(new Font("Arial",Font.BOLD,18));
        label13.setBounds(400,10,70,23);
        add(label13);

        next=new JButton("Next");
        next.setBounds(570,540,100,30);
        next.setFont(new Font("Arial",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.addActionListener(this);
        add(next);

        JLabel label2=new JLabel("PAGE 2");
        label2.setFont(new Font("Arial",Font.BOLD,12));
        label2.setBounds(400,600,60,30);
        add(label2);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(200,220,240));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String caste=(String) comboBox1.getSelectedItem();
        String Income = (String) comboBox2.getSelectedItem();
        String education=(String) comboBox3.getSelectedItem();
        String Occupation=(String) comboBox4.getSelectedItem();
        String Pan = (String) textpan.getText();
        String addhar=(String) textad.getText();

        String snr=" ";
        if(b1.isSelected())
        {
            snr="Yes";
        }
        else if (b2.isSelected()){
            snr="No";
        }
        try
        {
            if(textpan.getText().trim().isEmpty() || textad.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Please Fill up the fields");
            }
            else {
                connec c1= new connec();
                String query = "insert into signupp values('"+formnum+"','"+rel+"','"+caste+"','"+Income+"','"+education+"','"+Occupation+"','"+Pan+"','"+addhar+"','"+snr+"')";

                c1.statement.executeUpdate(query);
                new signuppp(formnum);
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        new signupp("");

    }

}