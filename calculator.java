package awt_gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setSize(400,500);
        Label l=new Label("Enter first number:");
        l.setBounds(40,40,100,40);
        TextField t=new TextField();
        t.setBounds(150,40,150,40);
        Label l2=new Label("Enter 2nd number:");
        l2.setBounds(40,90,100,40);
        TextField t2=new TextField();
        t2.setBounds(150,90,150,40);
        TextField t3=new TextField();
        t3.setBounds(80,140,150,40);
        Button b=new Button("+");
        b.setBounds(40,190,40,40);
        Button b2=new Button("-");
        b2.setBounds(90,190,40,40);
        Button b3=new Button("X");
        b3.setBounds(140,190,40,40);
        Button b4=new Button("/");
        b4.setBounds(190,190,40,40);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=Integer.parseInt(t.getText());
                int y=Integer.parseInt(t2.getText());
                t3.setText("Addition is :"+Integer.toString(x+y));
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=Integer.parseInt(t.getText());
                int y=Integer.parseInt(t2.getText());
                t3.setText("subtraction is :"+Integer.toString(x-y));
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=Integer.parseInt(t.getText());
                int y=Integer.parseInt(t2.getText());
                t3.setText("multiplication is :"+Integer.toString(x*y));
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=Integer.parseInt(t.getText());
                int y=Integer.parseInt(t2.getText());
                t3.setText("division is :"+Integer.toString(x/y));
            }
        });
        f.add(l);f.add(l2);f.add(t);
        f.add(t2);f.add(t3);f.add(b);
        f.add(b2);f.add(b3);f.add(b4);
        f.setLayout(null); f.setVisible(true);
    }
}
