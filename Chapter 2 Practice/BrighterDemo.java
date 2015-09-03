import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo
{
    public static void main(String[] arg)
    {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color myColor = new Color(147, 56, 89);
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
        
       