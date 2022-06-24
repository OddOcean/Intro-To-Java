// Lab01CStudentLastName.java
// Student starting version of the Lab01C assignment.
// Student Name:             Date:
// Purpose of Program: 
// Demonstrate knowledge of Canvas X&Y Coordinates and Graphics drawing methods  
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Lab01C_Weygandt extends Canvas{
   
   /* We need to create the JFrame object that will contain the Canvas Object*/
   public static void main(String[] args){
        JFrame frame = new JFrame("Lab 01C Drawing Shapes");/*Creates the JFrame and gives it a title */
        Canvas canvas = new Lab01C_Weygandt();/*This class extends Canvas so it is itself a canvas class and inherits everything Canvas has, so the consructor call has to be the same name as the class we are in */
        canvas.setSize(1100, 800);/*Set dimensions of canvas changing these numbers will change the size of your canvas */
        canvas.setBackground(Color.white);/* Set the background color of the canvas */
        frame.add(canvas);/* add the canvas object to the frame object */
        frame.pack();/* pack the canvas object into the frame object based on the canvas objects size and other settings */
        frame.setVisible(true);/* display the thing*/
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);//will end the application on close
        
    }
    public void paint(Graphics g) {
        //DRAW CUBE
        g.drawRect(50, 50, 300, 300);
        g.drawRect(100, 100, 300, 300);
        g.drawLine(50, 50, 100, 100);
        g.drawLine(350, 50, 400, 100);
        g.drawLine(50, 350, 100, 400);
        g.drawLine(350, 350, 400, 400);
        
        //DRAW SPHERE
        g.drawOval(75, 75, 300, 300);
        //LATITUDE
        g.drawOval(100, 75, 250, 300);
        g.drawOval(140, 75, 170, 300);
        g.drawOval(190, 75, 70, 300);
        //LONGITUDE
        g.drawOval(75, 100, 300, 250);
        g.drawOval(75, 140, 300, 170);
        g.drawOval(75, 190, 300, 70);
        
        
        //DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawLine(775, 150, 835, 254);
        g.drawLine(775, 150, 715, 254);
        g.drawLine(715, 254, 835, 254);

        g.drawOval(705, 150, 140, 140);
        g.drawOval(741, 185, 68, 68);
        
        
        //P
        g.fillRect(50, 450, 50, 300);
        g.fillRect(50, 450, 150, 50);
        g.fillRect(150, 450, 50, 150);
        g.fillRect(50, 550, 150, 50);
        
        //H
        g.fillRect(250, 450, 50, 300);
        g.fillRect(350, 450, 50, 300);
        g.fillRect(300, 575, 50, 50);
        
        //S
        g.fillRect(450, 450, 150, 50);
        g.fillRect(450, 450, 50, 175);
        g.fillRect(450, 575, 150, 50);
        g.fillRect(550, 575, 50, 175);
        g.fillRect(450, 700, 150, 50);
        
        //DRAW PACMEN FLOWER
        int [] xpoints_1 = {862, 825, 900};
        int [] ypoints_1 = {680, 750, 750};
        
        int [] xpoints_2 = {862, 825, 900};
        int [] ypoints_2 = {510, 440, 440};
        
        int [] xpoints_3 = {772, 702, 702};
        int [] ypoints_3 = {597, 634, 560};
        
        int [] xpoints_4 = {952, 1022, 1022};
        int [] ypoints_4 = {597, 634, 560};

        int sides = 3;
        
        g.fillOval(800, 620, 125, 125);
        g.fillOval(800, 450, 125, 125);
        g.fillOval(710, 535, 125, 125);
        g.fillOval(890, 535, 125, 125);
        g.setColor(Color.WHITE);
        
        //TRIANGLES
        g.fillPolygon(xpoints_1, ypoints_1, sides);
        g.fillPolygon(xpoints_2, ypoints_2, sides);
        g.fillPolygon(xpoints_3, ypoints_3, sides);
        g.fillPolygon(xpoints_4, ypoints_4, sides);
    }
        

}