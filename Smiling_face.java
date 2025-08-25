package AWT;
import java.awt.*;
import java.awt.event.*;
class Smiling_face extends Frame  {
    Smiling_face()
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
        g.drawRect(40,40,200,200);


        //face
        g.drawOval(90,70,80,80);


        //eyes
        g.drawOval(110,95,5,5);
        g.drawOval(145,95,5,5);

        //nose
        g.drawLine(130,95,130,115);

        //g.setColor(Color.red);

        g.drawArc(113,115,35,20,0,-180);


    }

    public static void main(String[] args) {
        // create a frame
        Smiling_face d=new Smiling_face();

        //set the size and tittle
        d.setSize(400,400);
        d.setTitle("My Drawing");

        //display the frame
        d.setVisible(true);
    }

}


