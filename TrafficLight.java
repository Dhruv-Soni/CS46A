/**
 * Simulates the traffic lights
 */
class TrafficLight
{
    public static final int GREEN = 0;
    public static final int YELLOW = 1;
    public static final int RED = 2;
    private int state;
    /**
     * Constructs TrafficLight to initialize the state
     */
    public TrafficLight()
    {
        state=RED;
    }

    /**
     * Changes the state of the light
     */
    public void changeLight()
    {
        boolean flag=true;
        if(state==RED && flag==true)
        {
            state=GREEN;
            flag=false;
        }
        else if (state==YELLOW && flag==true)
        {
            state= RED;
            flag=false;
        }
        else if(state==GREEN && flag==true)
        {
            state=YELLOW;
            flag=false;
        }
    }

    /**
     * will get the state of the light
     * @return a the state of the light
     */
    public String getLight()
    {
        String a = "";
        if(state == RED)
            a = "red";
        else if (state == GREEN)
            a = "green";       
        else if(state == YELLOW )
            a = "yellow";
        return a;
    }
}