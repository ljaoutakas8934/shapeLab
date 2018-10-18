/**
 * Creates a rectangle with two different side lengths and calculates the area by multiplying them and perimeter by adding all four sides
 */
public class Rectangle extends Shape
{
    private int height ;
    private int width;
    public Rectangle(int height, int width)
    {
        super("Rectangle");
        this.height = height;
        this.width  = width;
    }
    public double getArea()
    {

        return (height*width);
    }

    public double getPerimeter()
    {
        return (2*height)+(2*width);
    }
}
