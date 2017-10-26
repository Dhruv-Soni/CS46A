/**
 * to check if an individual qualifies for a loan
 */
public class LoanApplicant
{
    private double yearlySalary;
    private int years;
    /**
     * Constructor for loan application to initialize the values
     * @param annualSalary to know the annual salary for loan application
     * @param yearsOnJob to determine number of years on the job
     */
    public LoanApplicant(double annualSalary, int yearsOnJob)
    {
        yearlySalary = annualSalary;
        years = yearsOnJob;
    }

    /**
     * to check whether the person qualifies
     * @return false doesnt qualify 
     */
    public boolean qualifies()
    {
        boolean a = false;
        if(yearlySalary > 100000)
        {
            a = true;
        }
        if(yearlySalary > 50000 && yearlySalary <= 100000)
        {
            if(years >= 2)
            {
                a = true;
            }
            else
            {
                a = false;
            }
        }
        if(yearlySalary > 30000 && yearlySalary <= 50000)
        {
            if(years >= 5)
            {
                a = true;
            }
            else
            {
                a = false;
            }
        }
        if(yearlySalary <= 30000)
        {
            a = false;
        }
        return a;
    }

    /**
     * check the number of years on the job
     * @param y number of years on the job
     */
    public void setYearsOnJob(int y)
    {
        years = y;
    }

    /**
     * gets the number of years on job
     * @return the years on the job
     */
    public int getYearsOnJob()
    {
        return years;
    }

    /**
     * sets the annual salary to a certain value
     * @param salary intialized to zero
     */
    public void setAnnualSalary(double salary)
    {
        yearlySalary = salary;
    }
}
