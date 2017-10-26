/**
 * Draws two at different positions
 */
public class Two
{
    private int x;
    private int y;
    //Constructors
    /**
     * Constructs the Two object at given coordinates, x and y
     * @param xX x coordinate
     * @param yY y coordinate
     */
    public Two(int xX, int yY)
    {
        x = xX;
        y = yY;
    }
    //Methods
    /**
     * Draws the word TWO at different x and y coordinates
     */
    public void draw()
    {
        //Code for letter T
        Line tT1 = new Line(x, y, x+40, y);
        Line tT2 = new Line(x+20, y, x+20, y+50);
        tT1.draw();
        tT2.draw();
        tT1.setColor(Color.RED);
        tT2.setColor(Color.RED);
        Color blue = new Color(0,0,255);
        Line wW1 = new Line(x+50,y,x+60,y+50);
        wW1.setColor(blue);
        wW1.draw();
        Line wW2 = new Line(x+60,y+50,x+70,y);
        wW2.setColor(blue);
        wW2.draw();
        Line wW3 = new Line(x+70,y,x+80,y+50);
        wW3.setColor(blue);
        wW3.draw();
        Line wW4 = new Line(x+80,y+50,x+90,y);
        wW4.setColor(blue);
        wW4.draw();
        Ellipse eEl = new Ellipse(x+100,y,40,50);
        Color green = new Color(200,255,10);
        eEl.setColor(green);
        eEl.fill();
    }
}