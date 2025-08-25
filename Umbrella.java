package AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Umbrella extends Frame {

    Umbrella(){
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {

        //set blue color for drawing
        g.setColor(Color.blue);


//        //display a rectangle to contain drawing
//        g.fillRect(40, 40, 400, 400);
//
//        //face
//        g.setColor(Color.orange);
//        g.fillRect(120, 100, 200, 30);
//        g.setColor(Color.white);
//        g.fillRect(120, 130, 200, 30);
//        g.setColor(Color.green);
//        g.fillRect(120, 160, 200, 30);
//        g.setColor(Color.black);
//        g.fillRect(110, 100, 10, 250);
//
//        g.drawOval(200,130,30,30);
//
//
//        g.drawLine(215,130,215,160);
//        g.drawLine(200,145,230,145);
//        g.drawLine(204,137,226,152);
//        g.drawLine(204,152,226,137);
//
//        g.setColor(Color.red);
//        g.fillArc(110,85,10,30,0,180);

    }

    public static void main(String[] args) {
        // create a frame
        Flag d2 = new Flag();

        //set the size and tittle
        d2.setSize(400, 400);
        d2.setTitle("My Drawing");

        //display the frame
        d2.setVisible(true);
    }

}
