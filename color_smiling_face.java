package AWT;
import java.awt.*;

import java.awt.event.*;

public class color_smiling_face extends Frame{
    color_smiling_face()
    {
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){

        //set blue color for drawing
        g.setColor(Color.blue);


        //display a rectangle to contain drawing
        g.fillRect(40,40,200,200);

        //face
        g.setColor(Color.yellow);
        g.fillOval(90,70,80,80);

        //eyes
        g.setColor(Color.black);
        g.fillOval(110,95,5,5);
        g.fillOval(145,95,5,5);

        //nose
        g.drawLine(130,95,130,115);

        //mouth
        g.setColor(Color.red);
        g.fillArc(113,115,35,20,0,-180);


    }

    public static void main(String[] args) {
        // create a frame
        color_smiling_face d1 =new color_smiling_face();

        //set the size and tittle
        d1.setSize(450,450);
        d1.setTitle("My Drawing 2");

        //display the frame
        d1.setVisible(true);
    }

}
