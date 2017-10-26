public class Address implements comparable
{
    private int houseNumber;
    private String streetName;
    
    public Address(int number, String street)
    {
        streetName = street;
        houseNumber = number;
    }
    
    public int getHouseNumber()
    {
        return houseNumber;
    }
    
    public String getStreetName()
    {
        return streetName;
    }
    
    public int copmareTo(Object streetName)
    {
        Address houseName = new Address();
        if(streetName>houseNumber)
        {
        }
        
        
    }
}
