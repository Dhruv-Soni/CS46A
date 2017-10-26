import java.util.Random;
/**
 * Describes a mosaic table top
 */
public class MosaicTableTop
{
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int BLUE = 2;
    public static final int BLACK = 3;
    public static final int CYAN = 4;

    public static final int GAP = 3;
    public static final int SIDE = 10;

    private Random random;
    private int x;
    private int y;

    /**
     * Models a mosaic table top with upper left hand
     * conner at x, y and square tiles with side of side.
     * @param x the x coordinate of the upper left 
     * hand conner of the table top
     * @param y the x coordinate of the upper left 
     * hand conner of the table top
     * @param s the length of the side of each 
     * square tile
     */
    public MosaicTableTop(int x, int y)
    {
        random = new Random(12345);
        this.x=x;
        this.y=y;//complete this
    }

    /**
     * draw
     */
    public void draw()
    {
        int a = x;
        for(int i =0;i<6;i++)
        {
            for(int j=0;j<5;j++)
            {
                Rectangle rectangle = new Rectangle(x,y,SIDE,SIDE);
                rectangle.setColor(randomColor());
                rectangle.fill();
                x = x + GAP + SIDE;

            } 
            y = y + GAP + SIDE;
            x = a;
        }
    }

    /**
     * Randomly returns a color either red, green, 
     * blue, black or cyan
     * @return a random color either red, green, 
     * blue, black or cyan
     */
    public Color randomColor()
    {
        int n=random.nextInt(5);

        if(n==0)
        {
            return Color.RED;
        }
        else if(n==1)
        {
            return Color.GREEN;
        }
        else if(n==2)
        {
            return Color.BLUE;
        }
        else if(n==3)
        {
            return Color.BLACK;
        }
        else
        {
            return Color.CYAN;
        }
    }

    /**
     * Sets a new x for  the table top
     * @param x the new x coordinate of this object.
     */
    public void setX(int x)
    {
        this.x = x;
    }

    /**
     * Sets a new y for  the table top
     * @param y the new y coordinate of this object.
     */
    public void setY(int theY)
    {
        y = theY;
    }

}