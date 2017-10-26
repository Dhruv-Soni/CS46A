/**
 * Tells how many days until the 2016 
 * presidential election.
 */
public class DaysToElection
{
    public static void main(String[] args)
    {
        Day today = new Day();

        Day Election_Day = new Day(2016, 11, 8);

        int daysLeft = Election_Day.daysFrom(today);

        System.out.println(daysLeft);       

        System.out.println(today.toString()); //do not change this line
        //Do NOT put code here
    }
}
