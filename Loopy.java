import java.util.*;
public class Loopy
{
    public int sumOdd(int value)
    {
        int sum = 0;
        for(int i=1;i<value;i=i+2)
        {
            sum = sum + i;
        }
        return sum;
    }

    public double average(int count)
    {
        double sum=0;
        if(count>0)
        {
            for (int i = 1;i <= count;i++)
            {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter integer "+ i +": ");
                int a=in.nextInt();
                sum = sum + a;
            }
            double average = sum/count;
            return average;
        }
        else 
            return 0.0;
    }

    public int largestPowerLessThan(int value)
    {
        int a = 0;
        int i = 1;
        if(value < 2)
        {
            return -1;
        }
        else
        {
            while (Math.pow(2,i)<value)
            {
                a = i;
                i++;
            }
            return a;
        }
    }

}