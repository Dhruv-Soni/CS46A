class Horse extends Mammal
{
    /**
     * constructor to initialize the variables
     */
    public Horse(int litterSize)
    {
        super(litterSize);
    }
    /**
     * what the horse will eat
     * @return what the animal eats
     */
    public String eat()
    {
        return "hay";
    }
}