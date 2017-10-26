class Cat extends Mammal
{
    private int purrLevel;
    /**
     * Constructo to initlaize the variable
     */
    public Cat(int litterSize, int purrLevel)
    {
        super(litterSize);
        this.purrLevel = purrLevel;
        if(purrLevel<1 || purrLevel>10)
            this.purrLevel = 5;
    }

    /**
     * will get purrLevel of Cat
     */
    public int getPurrLevel()
    {
        return purrLevel;
    }

    /**
     * will get what the cat eats
     * @return what the animal eats
     */
    public String eat()
    {
        return "mice";
    }
}