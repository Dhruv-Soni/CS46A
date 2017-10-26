public class Circle
{
    private double radius;

    public Circle(double r)
    {
        radius = r;
    }

    public double circleArea()
    {
        double a = Math.PI * this.radius * this.radius;
        return a;
    }

    public static double circleArea(double radius)
    {
        double a = Math.PI * radius * radius;
        return a;
    }

    public void enlarge (double percent)
    {
        radius = (radius + percent)/10; 
    }
}