import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(0, 0, turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();   
        Turtle turtle1 = new Turtle(turtleWorld);
        //turtle1.setPenColor(Color.GREEN);
        //turtle1.penDown();
        //turtle1.forward(30);
        //int repeat = 0;
        turtle.turn(180);
        
        while (1>0) {
     
     turtle.forward(500);
     turtle.turn(270);
     turtle.forward(1);
     turtle.turn(270);
     turtle.forward(500);
     turtle.turn(90);
     turtle.forward(1);
     turtle.turn(90);
}
        
    }
}
