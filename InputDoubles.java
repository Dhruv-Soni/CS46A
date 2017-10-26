import java.util.*;
/**
 * Processes a collection of doubles
 */
public class InputDoubles
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a double or Q to quit: ");
        double value; 
        int v; 
        int counter = 0; 
        double max = 0; 
        double secondMax = 0; 
        int a = 0; 
        boolean first = true;
        while(in.hasNextDouble())
        {
            counter++;
            value=in.nextDouble();
            if(value < 0)
                a = 1;
            v = (int)value;
            if(v == value)
                System.out.println(value);

            if(first)
            {
                first = false;
                max = value;
                secondMax = value;
            }
            if(value > max)
            {
                secondMax = max;
                max = value;
            }
            if(value > secondMax && value < max)
                secondMax = value;
            System.out.print("Enter a double or Q to quit: ");
        }
        if(counter == 0)
            System.out.println("no input");
        else
        {   
            System.out.println(secondMax);
            if(a == 1)
                System.out.println("There are negatives numbers.");
            else
                System.out.println("There are no negative numbers.");
        }
    }
}