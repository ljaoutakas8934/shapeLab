/**
 * Creates a rectangle with two different side lengths of the name height and width
 */
public class Rectangle extends Shape
{
    private int height ;
    private int width;

    /**
     * initializes the parameters of the rectangle
     * @param height side length 1
     * @param width  side length 2
     */
    public Rectangle(int height, int width)
    {
        super("Rectangle");
        this.height = height;
        this.width  = width;
    }

    /**
     * multiplies the two side lengths to obtain area
     * @return returns product of side lengths which is area
     */
    public double getArea()
    {

        return (height*width);
    }

    /**
     * adds the side lengths to obtain perimeter
     * @return returns sum of all four side lengths
     */
    public double getPerimeter()
    {
        return (2*height)+(2*width);
    }
}
