/**
 * a subclass of the product class
 */
public class Cereal extends Product
{
    double gramsOfFiber;
    /**
     * constructor initialize the instance variable
     * @param thePrice to initialize instance variable
     * @param theDescription to initialize instance variable
     * @param thegramsOfFiber to initialize instance variable
     */
    public Cereal(double thePrice, String theDescription, double thegramsOfFiber)
    {
        super(thePrice, theDescription);
        gramsOfFiber=thegramsOfFiber;
    }

    /**
     * method to set the grams of fiber in cereal
     * @param fiber the fiber value
     */
    public void setGramsOfFiber(double fiber)
    {
        gramsOfFiber = fiber;
    }

    /**
     * method to check whether it is healthier
     * @param other to get the value
     * @return false
     */
    public boolean isHealthier(Cereal other)
    {
        if (gramsOfFiber> other.gramsOfFiber){
            return true; 
        }
        else {
            return false;
        }
    }

    /**
     * method to get grams of fiber in cereal
     * @return grams of fibers
     */
    public double getGramsOfFiber()
    {
        return gramsOfFiber;
    }

    /**
     * method to get description of cereal
     * @return null
     */
    public String getDescription() 
    {
        String a = super.getDescription() + " gramsOfFiber=" + gramsOfFiber;
        return a;
    }

}