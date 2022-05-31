package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class window extends JFrame implements WindowListener, ActionListener {

   private TextField f=new TextField();
    private JButton point=new JButton(".");
    private JButton b0=new JButton("0");
    private JButton b1=new JButton("1");
    private JButton b2=new JButton("2");
    private JButton b3=new JButton("3");
    private JButton b4=new JButton("4");
    private JButton b5=new JButton("5");
    private JButton b6=new JButton("6");
    private JButton b7=new JButton("7");
    private JButton b8=new JButton("8");
    private JButton b9=new JButton("9");
    private JButton result=new JButton("=");
    private JButton ad=new JButton("+");
    private  JButton sub=new JButton("-");
    private JButton eqw=new JButton("*");
    private JButton div=new JButton("/");
    Icon icon =new ImageIcon("src/com/company/resources/icons8-square-root-52 (1).png");
    private JButton sq=new JButton(icon);
    Icon iconchange =new ImageIcon("src/com/company/resources/icons8-plus-minus-+---50.png");
    private JButton change=new JButton(iconchange);
    private JButton Del=new JButton("C");
    Icon iconCancel =new ImageIcon("src/com/company/resources/icons8-left-arrow-50.png");
    private JButton Cancel=new JButton(iconCancel);
//    private JButton change=new JButton("#");
//    private JButton sq=new JButton("S");
//    private JButton Cancel=new JButton("A");
    private JButton pow=new JButton("^");
    private JButton mahraj=new JButton("$");
    private String text="";
    private int a=0;
    private int b=0;
    private char z;
    public window() {
        Font ex=new Font("Impact",Font.BOLD,40);
        setLayout(null);
        setSize(450, 650);
        setVisible(true);
        setLocation(750,300);
        result.setFont(ex);
        result.setSize(65,135);
        result.setLocation(350,380);
        result.setVisible(true);
        add(result);
        result.addActionListener(this);
        ad.setFont(ex);
        ad.setSize(60,135);
        ad.setLocation(265,380);
        ad.setVisible(true);
        add(ad);
        ad.addActionListener(this);
        sub.setFont(ex);
        sub.setSize(60,60);
        sub.setLocation(265,300);
        sub.setVisible(true);
        add(sub);
        sub.addActionListener(this);
        f.setFont(ex);
        f.setSize(330,60);
        f.setLocation(25,25);
        f.setVisible(true);
        add(f);
        b8.setFont(ex);
        b8.setSize(60,60);
        b8.setLocation(105,225);
        b8.setVisible(true);
        add(b8);
        b8.addActionListener(this);
        b9.setFont(ex);
        b9.setSize(60,60);
        b9.setLocation(180,225);
        b9.setVisible(true);
        add(b9);
        b7.setFont(ex);
        b7.setSize(60,60);
        b7.setLocation(25,225);
        b7.setVisible(true);
        add(b7);
        b9.addActionListener(this);
        b7.addActionListener(this);
        Del.setFont(ex);
        Del.setSize(60,60);
        Del.setLocation(350,225);
        Del.setVisible(true);
        add(Del);
        Del.addActionListener(this);
        b0.setFont(ex);
        b0.setSize(140,60);
        b0.setLocation(25,455);
        b0.setVisible(true);
        add(b0);
        b0.addActionListener(this);
        b6.setFont(ex);
        b6.setSize(60,60);
        b6.setLocation(180,300);
        b6.setVisible(true);
        add(b6);
        b6.addActionListener(this);
        b5.setFont(ex);
        b5.setSize(60,60);
        b5.setLocation(105,300);
        b5.setVisible(true);
        add(b5);
        b5.addActionListener(this);
        b4.setFont(ex);
        b4.setSize(60,60);
        b4.setLocation(25,300);
        b4.setVisible(true);
        add(b4);
        b4.addActionListener(this);
        b3.setFont(ex);
        b3.setSize(60,60);
        b3.setLocation(180,380);
        b3.setVisible(true);
        add(b3);
        b3.addActionListener(this);
        b2.setFont(ex);
        b2.setSize(60,60);
        b2.setLocation(105,380);
        b2.setVisible(true);
        add(b2);
        b2.addActionListener(this);
        b1.setFont(ex);
        b1.setSize(60,60);
        b1.setLocation(25,380);
        b1.setVisible(true);
        add(b1);
        b1.addActionListener(this);
        Cancel.setFont(ex);
        Cancel.setSize(60,60);
        Cancel.setLocation(350,150);
        Cancel.setVisible(true);
        add( Cancel);
        Cancel.addActionListener(this);
        eqw.setFont(ex);
        eqw.setSize(60,60);
        eqw.setLocation(265,225);
        eqw.setVisible(true);
        add(eqw);
        eqw.addActionListener(this);
        div.setFont(ex);
        div.setSize(60,60);
        div.setLocation(350,300);
        div.setVisible(true);
        add(div);
        sq.setFont(ex);
        sq.setSize(60,60);
        sq.setLocation(180,150);
        sq.setVisible(true);
        sq.addActionListener(this);
        add(sq);
        mahraj.setFont(ex);
        mahraj.setSize(60,60);
        mahraj.setLocation(25,150);
        mahraj.setVisible(true);
        mahraj.addActionListener(this);
        add(mahraj);
        pow.setFont(ex);
        pow.setSize(60,60);
        pow.setLocation(105,150);
        pow.setVisible(true);
        pow.addActionListener(this);
        add(pow);
        change.setFont(ex);
        change.setSize(60,60);
        change.setLocation(265,150);
        change.setVisible(true);
        change.addActionListener(this);
        add(change);
        point.setFont(ex);
        point.setSize(60,60);
        point.setLocation(180,455);
        point.setVisible(true);
        add(point);
        point.addActionListener(this);
    }






    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b7) {
            text = text + b7.getText();
            f.setText(text);
        }

        //  if (e.getSource()==sq){
        //double c =Integer.parseInt(f.getText());

        // }

        //   if (f.getText()!="") {
        // }
        if (e.getSource() == b8) {
            text = text + b8.getText();
            f.setText(text);
        }
        if (e.getSource() == b9) {
            text = text + b9.getText();
            f.setText(text);
        }
        if (e.getSource() == b6) {
            text = text + b6.getText();
            f.setText(text);
        }
        if (e.getSource() == b5) {
            text = text + b5.getText();
            f.setText(text);
        }
        if (e.getSource() == b4) {
            text = text + b4.getText();
            f.setText(text);
        }
        if (e.getSource() == b3) {
            text = text + b3.getText();
            f.setText(text);
        }
        if (e.getSource() == b2) {
            text = text + b2.getText();
            f.setText(text);
        }
        if (e.getSource() == b1) {
            text = text + b1.getText();
            f.setText(text);
        }
        if (e.getSource() == b0) {
            text = text + b0.getText();
            f.setText(text);
        }
        if (e.getSource() == Del) {
            text = "";
            f.setText(text);
        }
        if (e.getSource() == ad) {
            a = Integer.parseInt(text);
            f.setText(text + ad.getText());
            text = "";
            z = '+';

        }
        if (e.getSource() == eqw) {
            a = Integer.parseInt(text);
            f.setText(text + eqw.getText());
            text = "";
            z = '*';

        }

        if (e.getSource() == div) {
            a = Integer.parseInt(text);
            f.setText(text + div.getText());
            text = "";
            z = '/';

        }
        if (e.getSource() == pow) {
            double c = Integer.parseInt(f.getText());
            c = Math.pow(c, 2);
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if (e.getSource() == mahraj) {
            double c = Integer.parseInt(f.getText());
            c=1/c;
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }




        if (e.getSource() == result) {
            if (z == '^') {
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a * b));


            }
            if (e.getSource() == mahraj) {
                a = Integer.parseInt(text);
                f.setText(text + eqw.getText());
                text = "";
                z = '$';

            }
        }

        if (e.getSource() == point) {
            double c = Integer.parseInt(f.getText());

           text = ".";
           // butunni to'g'ri algoritimini kirit
            f.setText(String.valueOf(c));
            text = String.valueOf(c);


        }
        if (e.getSource() == change) {
            int c = Integer.parseInt(f.getText());
            text = ".";
            c = c * -1;
            // butunni to'g'ri algoritimini kirit
            f.setText(String.valueOf(c));
            text = String.valueOf(c);

        }
        if (e.getSource() == sq) {
            double c = Integer.parseInt(f.getText());
            c = Math.sqrt(c);
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }

        if (e.getSource() == sub) {
            a = Integer.parseInt(text);
            f.setText(text + sub.getText());
            text = "";
            z = '-';
        }
        if (e.getSource() == Cancel) {
            int c = Integer.parseInt(f.getText());
            c = c / 10;

            f.setText(String.valueOf(c));

            text = String.valueOf(c);

            // }else if (e.getSource()==eqw){
            //       f.setText(text+"*");
            // }
        }
        if (e.getSource() == result) {
            if (z == '+') {
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a + b));

            }


            // if (e.getSource() == b0) {
            //   double c = Integer.parseInt(f.getText());
            // f.setText(String.valueOf(c));
            //text = String.valueOf(c);
            // }
            // if (e.getSource() == eqw) {
            // System.out.println("**");
            //  a = Integer.parseInt(text);
            //f.setText(text + "*" + sub.getText());

            //ko'paytirish algoritimini kirit
            //f.setText((a * Double.parseDouble(eqw.getText()))+"");
            //z = '*';
            //}
            if (e.getSource() == result) {
                if (z == '-') {
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a - b));
                }


            if (e.getSource() == result) {
                if (z == '*') {
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a * b));
                }

            if (e.getSource() == result) {
                if (z == '/') {
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a / b));

                }

                if (e.getSource() == pow) {
                    double c = Integer.parseInt(f.getText());
                    c = Math.pow(c, 2);
                    f.setText(String.valueOf(c));
                    text = String.valueOf(c);
                }

                if (e.getSource() == result) {
                    if (z == '^') {
                        b = Integer.parseInt(text);
                        f.setText(String.valueOf(a * a));


                    }
                    if (e.getSource() == result) {
                        if (z == '$') {
                            b = Integer.parseInt(text);
                            f.setText(String.valueOf(1 / a));


                        }
                    }
                }
            }
        }
    }

             //   if (z == '*');
               // b = Integer.parseInt(text);
                //f.setText(String.valueOf(a*b));
            }

        }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
