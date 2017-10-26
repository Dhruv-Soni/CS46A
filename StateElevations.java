/**
 * provides statistics for a state with different information
 */
public class StateElevations
{
    private String stateName;
    private int[] elevations;

    /**
     * Constructs a StateElevations
     * @param name the name of the state
     * @param list the elevations in the state
     */
    public StateElevations(String name, int[] list)
    {
        stateName = name;
        elevations = list;
    }

    /**
     * Gets the name of the state
     * @return the name of the state
     */
    public String stateName()
    {
        return stateName;
    }

    /**
     * Gets the average of the elevations for this
     * state
     * @return the average of the elevations
     */
    public double average()
    {
        double sum = 0;
        double average = 0;
        for (int ev : elevations)
        {
            sum = sum + ev;
        }

        if (elevations.length > 0)
        {
            average = sum / elevations.length;
        }

        return average;
    }

    /**
     * the standard deviation for the data set of grades
     * @return standardDeviation 
     */
    public double standardDeviation()
    {
        double average = average();
        double[] a = new double[elevations.length];
        double aAvg = 0;
        double aSum = 0;
        for(int i = 0; i < elevations.length; i++)
        {
            a[i] = elevations[i] - average;
            a[i] = Math.pow(a[i],2);
            aSum = aSum + a[i];
        }
        aAvg = aSum/a.length;
        return Math.sqrt(aAvg);
    }

    /**
     * Gets the maximum elevation
     * @return max the maximum elevation
     */
    public int max()
    {
        int max = elevations[0];
        for(int i = 1; i < elevations.length;i++)
        {
            if(elevations[i]>max)
                max = elevations[i];
        }
        return max;
    }

    /**
     *  Gets the minimum elevation
     *  @return min the minimum elevation
     */
    public int min()
    {
        int min = elevations[0];
        for(int i = 1; i < elevations.length; i++)
        {
            if(elevations[i] < min)
                min = elevations[i];
        }
        return min;
    }

    /**
     * Gets the elevation span (the distance between the highest and lowest points)
     * @return elevationSpan
     */
    public int elevationSpan()
    {
        int max = max();
        int min = min();
        return max - min;
    }
}