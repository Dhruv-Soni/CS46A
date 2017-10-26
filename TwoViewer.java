
public class TwoViewer
{
    public static void main(String args[])
    {
        Line t1 = new Line(20,50,60,50);

        Color red = new Color(255,0,0);

        t1.setColor(red);

        t1.draw();

        Line t2 = new Line(40,50,40,100);

        t2.setColor(red);

        t2.draw();

        Color blue = new Color(0,0,255);

        Line t3 = new Line(70,50,80,100);

        t3.setColor(blue);

        t3.draw();

        Line t4 = new Line(80,100,90,50);

        t4.setColor(blue);

        t4.draw();

        Line t5 = new Line(90,50,100,100);

        t5.setColor(blue);

        t5.draw();

        Line t6 = new Line(100,100,110,50);

        t6.setColor(blue);

        t6.draw();

        Ellipse t7 = new Ellipse(120,50,40,50);

        Color green = new Color(200,255,10);

        t7.setColor(green);

        t7.fill();

    }
}