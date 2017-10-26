/**
 * Represents an object able to respond to several requests
 */
public class Sayer
{
    private String name;
    //declare a String instance variable called name
    /**
     * @constructor to initialize the value of name
     * @param na1 to store the value of name
     */
    public Sayer(String na1)
    {
        name = na1;
    }//Write the constructor to initialize the instance variable
    //Write the methods
    /**
     * will get the name associated with this object
     * @return name returns name associated with this object
     */
    public String getName()
    {
        return name;
    }

    /**
     * lays down a new name in this Sayer
     * @param newName changes new name to new assigned name
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * Greeting for the person
     * @return na1 returns the greeting
     */
    public String sayHello()
    {
        String na1 = "Hello, "+ name+".";
        return na1;
    }

    /**
     * communicates goodbye to the person
     * @return na1 returns the goodbye message
     */
    public String sayGoodbye()
    {
        String na1 = "Goodbye, " +name+".";
        return na1;
    }

    /**
     * The sorry message
     * @return na1 returns an error message
     */
    public String refuseHelp()
    {
        String na1 ="I am Sorry, "+ name +". "+ "I can't do that.";
        return na1;
    }
}