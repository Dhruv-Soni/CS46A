/**
 * a class that represents a persons name
 */
public class Name
{
    private String first;
    private String middle;
    private String last;
    /**
     * constructor to initalize the name
     * @param theFirst to get the first name
     * @param theMiddleInitial to get the middle name
     * @param theLast to get the last name
     */
    public Name(String theFirst, String theMiddleInitial, String theLast)
    {
        first = theFirst;
        middle = theMiddleInitial;
        last = theLast;
    }
    /**
     * constructor to initalize the name
     * @param theFirst to get the first name
     * @param theLast to get the last name
     */
    public Name(String theFirst, String theLast)
    {
        first =theFirst;
        middle = "";
        last = theLast;
    }
    /**
     * method to get the first name
     * @return first name
     */
    public String getFirst()
    {
        return first;
    }
    /**
     * method to get the middle initial
     * @return middle
     */
    public String getMiddleInitial()
    {
        return middle;
    }
    /**
     * method to get the last name
     * @return last name
     */
    public String getLast()
    {
        return last;
    }
    /**
     * method to give the total letter of the name
     * @return a the number of letter in name
     */
    public int numberOfCharacters()
    {
        return first.length()+middle.length()+last.length();
        
    }
    /**
     * method to print full name
     * @return full name 
     */
    public String getFullName()
    {
        return first + " " + middle + " " + last;
        
    }
    /**
     * method to get the initials
     * @return initials 
     */
    public String getInitials() 
    {
        String firstLetter = first.substring(0,1);
        String secondLetter = middle.substring(0);
        String lastLetter = last.substring(0,1);
        return firstLetter + secondLetter + lastLetter;
    }
}