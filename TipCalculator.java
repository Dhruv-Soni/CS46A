import java.util.*;
public class TipCalculator
{
    public static void main(String args[])
    {

        Scanner in = new Scanner (System.in);

        System.out.print("What was the cost of your cruise? ");

        double cost = in.nextDouble();

        double theTip=0;

        if (cost>0)
        {
            System.out.print("What is your statisfaction rating? 0 is poor and 3 is great: ");

            int theSat = in.nextInt();

            if(theSat >= 0 && theSat <= 3)
            {
                if(theSat == 0)
                {
                    theTip = 0.05*cost;
                }    
                else if (theSat == 1)
                {
                    theTip = 0.1*cost;
                }
                else if (theSat == 2) 
                {
                    theTip=0.15*cost;
                }
                else if(theSat == 3)
                {
                    theTip = 0.2*cost;
                }
                System.out.print("\nThe tip should be $");
                System.out.printf("%.2f",theTip);
                in.close();
            }
            else
                System.out.println("\nThe satisfaction rating must be 0, 1, 2, or 3");
        }
        else
            System.out.println("The cost must be a positive number");
    }
}