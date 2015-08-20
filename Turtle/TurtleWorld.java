import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();   
        Turtle turtle1 = new Turtle(turtleWorld);
        turtle1.setPenColor(Color.GREEN);
        turtle1.penDown();
        turtle1.forward(20);
        while (1 > 0) {
     turtle.forward(5);
        turtle.turn(5);
     turtle1.forward(5);
        turtle1.turn(5);
}
        
    }
}
