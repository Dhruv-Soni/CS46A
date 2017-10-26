public class Crow
{
    public static void main(String[] args)
    {
        Picture mycrow = new Picture("crow.png");
        mycrow.translate(100,75);
        mycrow.grow(75,62);
        mycrow.draw();

    }
}