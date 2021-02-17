import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.lang.*;

class Atm
{

    public static int index=0;
    public static String gct="",gnp="",wa="",da="",grenp="";
    public static Double x;
    public static void main(String[] args)throws Exception
    {
        String id;
        String[] pin = new String[1];
         double[] amt = {10000};
        pin[0] ="30242";
        id="30242";
        JFrame f=new JFrame("PIN");
        JPanel p=new JPanel();
        JLabel ac=new JLabel("A/C NUMBER");
        ac.setBounds(10,10,100,30);
        JLabel pi=new JLabel("PIN");
        pi.setBounds(10,50,100,30);
        JTextField act=new JTextField();
        act.setBounds(100,10,150,30);
        JTextField pit=new JPasswordField();
        pit.setBounds(100,50,150,30);
        JButton b=new JButton("SUBMIT");
        b.setBounds(100,190,100,30);
        JLabel l1=new JLabel("DEPOSIT");
        l1.setBounds(10,10,150,30);
        JLabel l2=new JLabel("WITHDRAW");
        l2.setBounds(10,50,150,30);
        JLabel l3=new JLabel("BALANCE ENQUIRY");
        l3.setBounds(10,90,150,30);
        //   JLabel l4=new JLabel("balance statements");
        //   l4.setBounds(10,130,150,30);
        JLabel l5=new JLabel("CHANGE PIN");
        l5.setBounds(10,130,150,30);
        JButton lb1=new JButton("SUBMIT");
        lb1.setBounds(200,10,100,30);
        JButton lb2=new JButton("SUBMIT");
        lb2.setBounds(200,50,100,30);
        JButton lb3=new JButton("SUBMIT");
        lb3.setBounds(200,90,100,30);
        //  JButton lb4=new JButton("SUBMIT");
        //  lb4.setBounds(200,130,100,30);
        JButton lb5=new JButton("SUBMIT");
        lb5.setBounds(200,130,100,30);


        p.add(ac);
        p.add(pi);
        p.add(act);
        p.add(pit);
        p.add(b);
        f.add(p);
        f.setSize(400,390);
        p.setLayout(null);
        f.setVisible(true);
        String aki;
        aki=act.getText();



        //......................OPTION ACTION.....................


        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){


                JFrame f=new JFrame("OPTION");
                JPanel p=new JPanel();
                JLabel error=new JLabel("ENTER VALID DETAILS");

                if(act.getText().equals(pit.getText()))
                {
                    p.add(l1);
                    p.add(l2);
                    p.add(l3);
                    // p.add(l4);
                    p.add(l5);
                    p.add(lb1);
                    p.add(lb2);
                    p.add(lb3);
                    //  p.add(lb4);
                    p.add(lb5);
                    f.add(p);


                    f.setSize(450,400);
                    p.setLayout(null);
                    f.setVisible(true);

                }
            }

        });


        //........................lb1..cash deposit.........................

        lb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame f=new JFrame("CASH DEPOSIT");
                JPanel p=new JPanel();

                JLabel ea=new JLabel("ENTER AMOUNT");
                ea.setBounds( 10,10 ,100,30);
                JTextField eam=new JTextField();
                eam.setBounds(50 ,50 ,100,30);
                JButton d=new JButton("DEPOSIT");
                d.setBounds( 100,190 ,100,30);

                f.add(ea);
                f.add(eam);
                f.add(d);

                d.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){

                        JLabel ds=new JLabel("DEPOSIT SUCCESSFULLY");
                        ds.setBounds(10,150,150,30);
                        da=eam.getText();
                        x=Double.parseDouble(da);
                        amt[0] +=x;
                        f.add(ds);
                        f.dispose();
                        f.setSize(400,390);
                        f.setLayout(null);
                        f.setVisible(true);
                    }

                });


                f.setSize(400,390);
                f.setLayout(null);
                f.setVisible(true);

            }

        });
        //........................lb2..cash withdrawals.........................
        lb2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame f=new JFrame("CASH WITHDRAWAL");
                JPanel p=new JPanel();
                JLabel ea=new JLabel("ENTER AMOUNT");
                ea.setBounds( 10,10 ,100,30);
                JTextField eam=new JTextField();
                eam.setBounds(50 ,50 ,100,30);
                JButton d=new JButton("WITHDRAW");
                d.setBounds( 100,190 ,100,30);

                f.add(ea);
                f.add(eam);
                f.add(d);

                d.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){

                        JLabel ds=new JLabel("WITHDRAWAL SUCCESSFULLY");
                        ds.setBounds(10,150,200,30);
                        wa=eam.getText();
                        x=Double.parseDouble(wa);
                        amt[0]= amt[0]-x;
                        f.add(ds);
                        f.dispose();
                        f.setSize(400,390);
                        f.setLayout(null);
                        f.setVisible(true);
                    }

                });

                f.setSize(400,390);
                f.setLayout(null);
                f.setVisible(true);
            }

        });
        //........................lb3..balance enquiry.........................
        lb3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                JFrame f=new JFrame("BALANCE ENQUIRY");
                JPanel p=new JPanel();
                JLabel bal=new JLabel("BALANCE");
                bal.setBounds(10,10,150,30);
                JTextField bamt=new JTextField();
                bamt.setBounds(50,60,100,30);
                String a;
                a=Double.toString(amt[0]);
                bamt.setText(a);
                f.add(bal);
                f.add(bamt);
                f.setSize(400,390);
                f.setLayout(null);
                f.setVisible(true);


            }

        });

        //........................lb5..change pin...........................
        lb5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame f=new JFrame("CHANGE PIN");
                JLabel cs=new JLabel("Changed Successfully");
                cs.setBounds(10,300,150,30);
                JPanel p=new JPanel();
                JLabel ecp=new JLabel("ENTER CURRENT PIN");
                ecp.setBounds(10,10,150,30);
                JLabel np=new JLabel("ENTER NEW PIN");
                np.setBounds(10,60,150,30);
                JLabel rnp=new JLabel("RE-ENTER PIN");
                rnp.setBounds(10,120,150,30);
                JTextField acp=new JPasswordField();
                acp.setBounds(150,10,100,30);
                JTextField anp=new JPasswordField();
                anp.setBounds(150,60,100,30);
                JTextField arnp=new JPasswordField();
                arnp.setBounds(150,120,100,30);
                JButton snp=new JButton("SUBMIT");
                snp.setBounds(150,180,100,30);

                f.add(ecp);
                f.add(np);
                f.add(rnp);
                f.add(snp);
                f.add(acp);
                f.add(anp);
                f.add(arnp);
                snp.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        gct=acp.getText();
                        gnp=anp.getText();
                        grenp=arnp.getText();
                        if(gct.equals(pin[0]))
                        {
                            if(gnp.equals(grenp))
                            {
                                pin[0] =grenp;
                            }
                        }
                        f.add(cs);
                        f.dispose();
                        f.setSize(400,390);
                        f.setLayout(null);
                        f.setVisible(true);
                    }

                });

                f.setSize(400,390);
                f.setLayout(null);
                f.setVisible(true);
            }

        });
    }
}
      
