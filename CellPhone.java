/**
 * Models a Cell Phone 
 */
public class CellPhone implements Comparable
{
    private String brand;
    private double gBOfRam;

    /**
     * @param brand to initalize the instance variable
     * @param gb to initialize the instance variable
     */
    public CellPhone(String brand, double gb){
        this.brand = brand;
        gBOfRam = gb;
    }

    /**
     * Gets a string representation of the object
     * @return a string representation of the object
     */
    public String toString()
    {
        String s = getClass().getName()
            + "[brand=" + brand
            + ",ram=" + gBOfRam
            + "]";
        return s;

    }

    /**
     * gets the gb ram for a particular phone
     * @return gBOfRam
     */
    public double getRam(){
        return gBOfRam;
    }

    /**
     * gets the brand for the particular phone
     * @return brand
     */
    public String getBrand(){
        return brand;
    }

    /**
     *@return 1
     *@param phone1 the arguement we will compare with 
     */
    public int compareTo(Object phone1){
        CellPhone phone2 = (CellPhone)phone1;
        if (gBOfRam > phone2.getRam()){
            return 1;
        }
        else if (gBOfRam < phone2.getRam()){
            return -1;
        }

        else {
            return brand.compareTo(phone2.getBrand());
        }

    }
}
