import java.util.Random;

public class RandomTest
{
    public static void main(String[] args)
    {
       //OPTION A
        Random generator = new Random();
        int panda = generator.nextInt(6);
        System.out.println(panda + 1);
        
        //OPTION B
        double dievalue = Math.random(); //returns a double between 0 (inclusive) abd 1 (exlucsive)
        dievalue *= 6; //range [0, 6)
        dievalue += 1; //range [1,7)
        System.out.println( (int) dievalue); //prints 1, 2, 3, 4, 5, 6
        
    }
}