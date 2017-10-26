class Dog extends Mammal
{
    /**
     * Constructs to initialize the variable
     */
    public Dog(int litterSize)
    {
        super(litterSize);
    }

    /**
     * returns what a dog eats
     * @return the aminal the dog eats
     */
    public String eat()
    {
        return "rabbits";
    }
}