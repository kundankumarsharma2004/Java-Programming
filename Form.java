package AWT;

import java.awt.*;
import java.awt.event.*;
public class Form
{
    public static void main(String s[])
    {
        MyFrame m=new MyFrame();
        m.setBounds(100,100,300,360);
        m.setVisible(true);
    }
}
class MyFrame extends Frame
{
    TextField t1,t2,t3,t4,t5,t6;
    Label heading,l1,l2,l3,l4,l5,l6,l7,l8,l9;
    Button submit,cancel;
    public MyFrame()
    {
        setLayout(new FlowLayout());
        setBackground(Color.white);
        setForeground(Color.blue);
//heading,submit line,cancel line
        heading = new Label("***Fill the following details... \t\t\t\t\t\t\t\t\t ");
        heading.setForeground(Color.red);
//name
        l1 = new Label("First name: ");
        t1 = new TextField(20);
        l2 = new Label("Last name: ");
        t2 = new TextField(20);
//dob
        l3 = new Label("Date of Birth: ");
        t3 = new TextField(1);
        l4 = new Label("/");
        t4 = new TextField(1);
        l5 = new Label("/");
        t5 = new TextField(2);
//gender
        l6 = new Label("Gender: ");
        CheckboxGroup gender = new CheckboxGroup();
        Checkbox g1 = new Checkbox("Male",gender,false);
        Checkbox g2 = new Checkbox("Female",gender,false);
        Checkbox g3 = new Checkbox("Others",gender,false);
//Educational qualification
        l7=new Label("Qualification:     ");
        Choice edu = new Choice();
        edu.add("  Secondary");
        edu.add("  Higher Secondary");
        edu.add("  Diploma");
        edu.add("  Under Graduate");
        edu.add("  Post Graduate");
        edu.add("  Ph.D");
        edu.add("  None");
//languages
        l8 = new Label("Languages: ");
        Checkbox c1 = new Checkbox("Bengali",true);
        Checkbox c2 = new Checkbox("English");
        Checkbox c3 = new Checkbox("Hindi");
//introduction
        l9 = new Label("Brief Introduction about yourself : ");
                t6 = new TextField(30);
        //buttons
        submit = new Button("Submit");
        submit.setForeground(Color.green);
        cancel = new Button("Cancel");
        cancel.setForeground(Color.red);
        add(heading);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(g1);
        add(g2);
        add(g3);
        add(l7);
        add(edu);
        add(l8);
        add(c1);
        add(c2);
        add(c3);
        add(l9);
        add(t6);
        add(submit);
        add(cancel);

        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                dispose();
            }
        });
    }
}
