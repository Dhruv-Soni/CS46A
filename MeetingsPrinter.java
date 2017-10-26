/*
 * Print the dates of department meetings
 */
public class MeetingsPrinter
{
    public static void main(String[] args)
    {
        Day firstMeetingDay = new Day(2015, 9, 10);

        System.out.println(firstMeetingDay.toString());

        firstMeetingDay.addDays(56);

        System.out.println(firstMeetingDay.toString());

        firstMeetingDay.addDays(56);

        System.out.println(firstMeetingDay.toString());

        firstMeetingDay.addDays(56);

        System.out.println(firstMeetingDay.toString());

        System.out.println(firstMeetingDay.getYear());
        //put our code here
    }
}