/**
 * Draws 5 circles in a right angle
 */
public class FiveCircles
{
    public static void main(String[] args)
    {
        final int X = 100; 

        final int Y = 150;

        final int NUMBER_OF_CIRCLES = 5;

        final int SMALLEST_DIAMETER =  20;

        int radius;

        int diameter = SMALLEST_DIAMETER;

        for(int i=1;i<=NUMBER_OF_CIRCLES;i++)
        {
            radius=diameter/2;

            Ellipse b = new Ellipse (X-(2*radius),Y-(2*radius),diameter,diameter);

            b.draw();

            diameter = diameter + 20;
        }
        Line x = new Line(X,0, X, Y);

        x.draw();

        Line y = new Line(0, Y, X, Y);

        y.draw();
    }
}