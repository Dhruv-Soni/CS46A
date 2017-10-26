import java.util.ArrayList;
/**
 * Modules a university with a list of Students
 */
public class University
{
    ArrayList<Student> studentBody;
    /**
     * Constructs University object with
     * no Students
     */
    public University()
    {
        studentBody = new ArrayList<Student>();
    }

    public void add(Student add)
    {
        studentBody.add(add);
    }

    public String toString()
    {
        return  studentBody.toString();
    }

    public String hasGPAGreaterThan(double target)
    {
        boolean flag = false;
        int i = 0;
        String q = "";
        while(i < studentBody.size() && flag == false)
        {
            Student w = studentBody.get(i);
            double gpa = w.getGPA();
            if(gpa > target)
            {
                q = w.getName();
                flag = true;
            }
            i++;
        }
        return q;
    }

    public ArrayList<String> getStudents()
    {
        ArrayList<String> name = new ArrayList<String>();
        int i = 0;
        while(i<studentBody.size())
        {
            Student q = studentBody.get(i);
            name.add(q.getName());
            i++;
        }
        return name;
    }
}