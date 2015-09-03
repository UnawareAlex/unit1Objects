import java.awt.Color;
import java.util.Random;
import java.lang.Object;


public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        
        Turtle tahu = new Turtle(turtleWorld);
        tahu.setPenColor(Color.RED);
        tahu.setShellColor(Color.RED);
        tahu.penDown();
        tahu.penUp();
        tahu.turn(180);
        tahu.forward(173);
        tahu.turn(90);
        tahu.backward(100);
        tahu.penDown();
        tahu.setPenWidth(10);
        
        Turtle lewa = new Turtle(turtleWorld);
        lewa.setPenColor(Color.WHITE);
        lewa.penDown();
        lewa.penUp();
        lewa.setPenWidth(5);
        lewa.turn(-90);
        lewa.forward(130);
        lewa.turn(90);
        
        lewa.penDown();          //MAKING THE LETTER S
        lewa.forward(40);
        lewa.turn(90);
        lewa.forward(40);
        lewa.turn(180);
        lewa.forward(40);
        lewa.turn(-90);
        lewa.forward(40);
        lewa.turn(-90);
        lewa.forward(40);
        lewa.turn(90);
        lewa.forward(40);
        lewa.turn(90);
        lewa.forward(40);
        
        lewa.penUp();           //MAKING THE LETTER T
        lewa.turn(180);
        lewa.forward(100);
        lewa.turn(-90);
        lewa.penDown();
        lewa.forward(80);
        lewa.turn(-90);
        lewa.forward(30);
        lewa.turn(180);
        lewa.forward(60);
        
        lewa.penUp();           ///MAKING LETTER O
        lewa.
        
        
        
        
        
        
        int re = 0;
        int fill = 0;
        int loop = 1;
        while (re < 7 ) //Creation of intial hexagon
        {
            tahu.forward(200);
            tahu.turn(60);
            re += 1; 
        }
        while (loop < 348) //Fills the hexagon up
        {
            tahu.turn(30);
            tahu.forward(1);
            tahu.turn(-30);
            
            while (loop < 348)
            {
                tahu.forward(200 - loop);
                tahu.turn(60);
                loop += 1;
            }
            
            
        }
        
    }
}