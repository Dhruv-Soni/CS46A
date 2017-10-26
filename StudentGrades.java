/**
 * Represents the grades of a group of students and a copy of it too
 */
public class StudentGrades
{
    private double[] grades;
    /**
     * Constructor to initialize instance variable grades
     * @param grades in the array
     */
    public StudentGrades(double[] grades)
    {
        this.grades = grades;
    }

    /**
     * Finds the maximum grade
     * @return max the max grade
     */
    public double max()
    {
        double max = grades[0];
        for(int i=0; i < grades.length; i++)
        {
            if(grades[i] > max)
                max = grades[i];
        }
        return max;
    }

    /**
     * Finds the minimum grade
     * @return min the minimum grade
     */
    public double min()
    {
        double min = grades[0];
        for(int i = 0; i < grades.length; i++)
        {
            if(grades[i] < min)
                min = grades[i];
        }
        return min;
    }

    /**
     * Finds the average grade
     * @return average the average of all grades
     */
    public double average()
    {
        double average;
        double sum = 0;
        for(int i = 0; i < grades.length; i++)
        {
            sum = sum + grades[i];
        }
        average = sum/grades.length;
        return average;
    }

    /**
     * Finds the difference in max and min grade
     * @return maxDifference between the highest and lowest grade
     */
    public double maxDifference()
    {
        double max = max();
        double min = min();
        double maxDifference = max-min;
        return maxDifference;
    }

    /**
     * Makes a copy of the grades
     * @return copy copy of the grades
     */
    public double[] copy()
    {
        double[] copy = new double[grades.length];
        for(int i = 0; i < grades.length; i++)
        {
            copy[i] = grades[i];
        }
        return copy;
    }
}
