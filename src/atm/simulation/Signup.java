package atm.simulation;

import com.toedter.calendar.JDateChooser;

import javax.management.Query;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JTextField textname,textfaname,textMail,textadd,textcountry,textcity,textstate,textcode;
    JDateChooser dateChooser;
    JRadioButton button1,button2,button3,button4;
    JButton next;
    Random rand =new Random();
    long f4 = (rand.nextLong()%9000L)+1000L;
    String first= "  "+Math.abs(f4);
        Signup(){

        super("APPLICATION FORM");
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank3.png"));
            Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(25,10,100,100);
            add(image);

            JLabel label1= new JLabel("APPLICATION NUMBER:"+f4);
            label1.setBounds(260,30,400,40);
            label1.setFont(new Font("Arial",Font.BOLD,28));
            add(label1);


            JLabel label3= new JLabel("Personal information:");
            label3.setFont(new Font("Arial",Font.BOLD,18));
            label3.setBounds(150,100,300,30);
            add(label3);

            JLabel label_name= new JLabel("Full name: ");
            label_name.setFont(new Font("Arial",Font.BOLD,14));
            label_name.setBounds(150,150,250,20);
            add(label_name);

            textname = new JTextField();
            textname.setFont(new Font("Raleway",Font.BOLD,14));
            textname.setBounds(226,152,275,20);
            add(textname);

            JLabel label_faname= new JLabel("Guardian's name: ");
            label_faname.setFont(new Font("Arial",Font.BOLD,14));
            label_faname.setBounds(100,170,275,40);
            add(label_faname);

            textfaname = new JTextField();
            textfaname.setFont(new Font("Raleway",Font.BOLD,14));
            textfaname.setBounds(226,182,275,20);
            add(textfaname);

            JLabel gen= new JLabel("Gender:");
            gen.setFont(new Font("Arial",Font.BOLD,14));
            gen.setBounds(165,210,275,40);
            add(gen);

            button1 = new JRadioButton("Male");
            button1.setFont(new Font("Arial", Font.BOLD, 14));
            button1.setBounds(250, 210, 100, 40); // Correct width
            button1.setBackground(new Color(200, 220, 240));
            add(button1);

            button2 = new JRadioButton("Female");
            button2.setFont(new Font("Arial", Font.BOLD, 14));
            button2.setBounds(350, 210, 100, 40); // Move it to the right
            button2.setBackground(new Color(200, 220, 240));
            add(button2);



            JLabel dob= new JLabel("Date of Birth: ");
            dob.setFont(new Font("Arial",Font.BOLD,14));
            dob.setBounds(131,250,275,40);
            add(dob);

            dateChooser= new JDateChooser();
            dateChooser.setForeground(new Color(105,105,105));
            dateChooser.setBounds(226,260,275,20);
            add(dateChooser);


            ButtonGroup buttonGroup= new ButtonGroup();
            buttonGroup.add(button1);
            buttonGroup.add(button2);


            JLabel gmail=new JLabel("EMAIL Address:");
            gmail.setFont(new Font("Arial",Font.BOLD,14));
            gmail.setBounds(110,298,275,40);
            add(gmail);

            textMail=new JTextField();
            textMail.setFont(new Font("Arial",Font.BOLD,14));
            textMail.setBounds(230,310,250,20);
            add(textMail);

            JLabel mar=new JLabel("Marital Status:");
            mar.setFont(new Font("Arial",Font.BOLD,14));
            mar.setBounds(110,350,275,40);
            add(mar);

            button3 = new JRadioButton("Married");
            button3.setFont(new Font("Arial", Font.BOLD, 14));
            button3.setBounds(245, 350, 100, 40); // Correct width
            button3.setBackground(new Color(200, 220, 240));
            add(button3);

            button4 = new JRadioButton("Unmarried");
            button4.setFont(new Font("Arial", Font.BOLD, 14));
            button4.setBounds(345, 350, 100, 40); // Move it to the right
            button4.setBackground(new Color(200, 220, 240));
            add(button4);

            ButtonGroup buttonGroup1= new ButtonGroup();
            buttonGroup1.add(button3);
            buttonGroup1.add(button4);



            JLabel address= new JLabel("Address: ");
            address.setFont(new Font("Arial",Font.BOLD,14));
            address.setBounds(145,399,275,40);
            add(address);

            textadd= new JTextField();
            textadd.setFont(new Font("Raleway",Font.BOLD,14));
            textadd.setBounds(220,399,500,30);
            add(textadd);

            JLabel country= new JLabel("Country:");
            country.setFont(new Font("Arial",Font.BOLD,14));
            country.setBounds(145,430,260,40);
            add(country);

            textcountry = new JTextField();
            textcountry.setFont(new Font("Arial",Font.BOLD,14));
            textcountry.setBounds(220,441,120,20);
            add(textcountry);

            JLabel state= new JLabel("State:");
            state.setFont(new Font("Arial",Font.BOLD,14));
            state.setBounds(360,441,120,20);
            add(state);

            textstate = new JTextField();
            textstate.setFont(new Font("Arial",Font.BOLD,14));
            textstate.setBounds(400,441,190,20);
            add(textstate);

            JLabel city= new JLabel("City:");
            city.setFont(new Font("Arial",Font.BOLD,14));
            city.setBounds(170,489,120,20);
            add(city);

            textcity = new JTextField();
            textcity.setFont(new Font("Arial",Font.BOLD,14));
            textcity.setBounds(220,489,270,20);
            add(textcity);

            JLabel pin= new JLabel("PIN Code:");
            pin.setFont(new Font("Arial",Font.BOLD,14));
            pin.setBounds(135,530,120,20);
            add(pin);

            textcode = new JTextField();
            textcode.setFont(new Font("Arial",Font.BOLD,14));
            textcode.setBounds(220,530,270,20);
            add(textcode);

            next = new JButton("Next");
            next.setFont(new Font("Arial",Font.BOLD,14));
            next.setBackground(Color.BLACK);
            next.setForeground(Color.white);
            next.setBounds(640,530,80,20);
           next.addActionListener(this);
            add(next);




            JLabel label2=new JLabel("PAGE 1");
            label2.setFont(new Font("Arial",Font.BOLD,12));
            label2.setBounds(400,580,600,25);
            add(label2);

            getContentPane().setBackground(new Color(200, 220, 240));
            setLayout(null);
            setSize(850,800);
            setLocation(360,40);
            setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formnum= first;
        String name=textname.getText();
        String fname=textfaname.getText();
        //Signup JTextField;
        String gender=null;
         if(button1.isSelected())
         {
             gender="Male";
         } else if (button2.isSelected()) {
             gender="Female";
         }
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
         String email=textMail.getText();
         String marital=null;
         if(button3.isSelected())
         {
             marital="Married";
         } else if (button4.isSelected()) {
             marital="Unmarried";
         }
         String address=textadd.getText();
         String country=textcountry.getText();
         String state=textstate.getText();
         String city=textcity.getText();
         String code=textcode.getText();

         try{
            if(textname.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Please Fill up this field.");
            }else {
                connec conec1= new connec();
                String query="insert into signup values('"+formnum+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+country+"','"+city+"','"+state+"','"+code+"')";
                conec1.statement.executeUpdate(query);
                new signupp(first);
                setVisible(false);
            }
         }catch (Exception E)
         {
             E.printStackTrace();
         }

    }

    public static void main(String[] args) {
    new Signup();
    }

}
