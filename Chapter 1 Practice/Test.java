import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL("http://vignette2.wikia.nocookie.net/survivorfanon/images/7/7e/Megusta.png/revision/latest?cb=20150703204403");
        JOptionPane.showMessageDialog(null, "Me gusta", "Title", 
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}


        
