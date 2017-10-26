/**
 * Describes a Student with a name and grade point.
 * 
 */
public class Student
{
    private String name;
    private double gpa;
    /**
     * constructor to assign the values
     * @param name1 name of the student
     * @param gpa1 for grade point average of the student
     */
    public Student(String name1, double gpa1) 
    {
        name = name1;
        gpa = gpa1;
    }

    /**
     * Return the name
     * @return name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * returns the gpa
     * @return gpa of the person
     */
    public double getGpa()
    {
        return gpa;
    }

    /**
     * changes the gpa of the person
     * @param gpa1 new gpa value
     */
    public void changeGpa(double gpa1)
    {
        gpa = gpa1;
    }
}