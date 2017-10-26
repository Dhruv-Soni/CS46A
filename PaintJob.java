/**
 * Describes a PaintJob of a cylindrical room 
 * with a domed roof
 * 
 */
public class PaintJob
{

    private double height,radius;
    public static final int SQ_FT_PER_SQ_YARD = 9;
    public static final double P_C_G = 95.50;
    public static final double S_F_P_G = 40;
    public static final double S_Y = 100;

    /**
     * Constructor PaintJob takes the height and radium of the cylinder as parameters
     * @param theH takes the height of the cylinder
     * @param theR takes the radius of the cylinder
     */
    public PaintJob(double theH, double theR)
    {
        height=theH;
        radius=theR;
    }

    /**
     * Returns the surface area of the cylinder
     * @return sA gets the surface area
     */
    public double getSurfaceArea()
    {
        double sA= (2*Math.PI*Math.pow(radius,2))+(2*Math.PI*radius*height);
        return sA;
    }

    /**
     * Returns the cost of paint
     * @return paintCost gets cost of paint used
     */
    public double getPaintCost()
    {
        double paintCost=(getSurfaceArea()*P_C_G)/S_F_P_G;
        return paintCost;
    }

    /**
     * Return the labor charge
     * @return laborCharge gets charge for used labor
     */
    public double getLaborCharge()
    {
        double pricePerSquareFeet = S_Y/SQ_FT_PER_SQ_YARD;
        double laborCharge = getSurfaceArea()*pricePerSquareFeet;
        return laborCharge;
    }

    /**
     * Returns the price the customer has to pay
     * @return customerPrice price the cstomer has to be charged		
     */
    public double getCustomerPrice()
    {
        double customerPrice = getLaborCharge()+ getPaintCost();
        return customerPrice;
    }

    /**
     * sets a new height for room in this paint job
     * @param theHeight the new height
     */
    public void setHeight(double theHeight)
    {
        height = theHeight;
    }

    /**
     * sets a new radius for room in this paint job
     * @param theRadius the new radius
     */
    public void setRadius(double theRadius)
    {
        radius = theRadius;
    }
}