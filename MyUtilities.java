import java.util.*;
/**
 * finds sum, search for a specific item and get maximum
 */
class MyUtilities
{
    /**
     * computes the sum for the array(double)
     * @param a the double array for which the sum will be computed
     */
    public static double sum(double[] a)
    {
        double sum=0;
        if(a.length>0)
            for(int i=0;i<a.length;i++)
                sum=sum+a[i];

        return sum;
    }

    /**
     * Computes the sum of the array(int)
     * @param a the integer array for which the sum will be computed
     */
    public static int sum(int[] a)
    {
        int sum=0;
        if(a.length>0)
            for(int i=0;i<a.length;i++)
                sum=sum+a[i];

        return (int)sum;
    }

    /**
     * will search for the array 
     * @param a, b the array it will search in and the value we want to search it in
     * @return c the first occurence of the target value
     */
    public static int search(int[] a, int b)
    {
        boolean flag = false;
        int c =0;
        int i = 0;
        while(!flag && i<a.length)
        {
            if(a[i]==b)
            {
                c=i;
                flag = true;
            }
            else
            {
                i++;
            }

        }
        if(!flag)
        {
            return -1;
        }
        return c;
    }

    /**
     * get the max value from a 2d array
     * @param a the 2d array we will check
     * @return max the maximum value in the 2d array
     */
    public static int max(int[][] a)
    {
        int max = a[0][0];
        int b = 0; 
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<a[0].length; j++)
            {
                b = a[i][j];   
                if(b>max)
                {
                    max = b;
                }
            }
        }
        return max;
    }

    /**
     * gets the max GPA in the ArrayList
     * @param a the arraylist we will check
     * @return max the max gpa
     */
    public static double max(ArrayList<Student> a)
    {

        if(a.size()>0)
        {
            double b = 0;
            double max = a.get(0).getGPA();
            int i = 0;

            while(i<a.size())
            {
                b = a.get(i).getGPA();
                if(b>max)
                {
                    max = b;
                }
                i++;
            }
            return max;
        }
        else
        {
            return -1;
        }
    }
}