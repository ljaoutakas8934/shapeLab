// Author: Lin Yao Pan
public class ETriangle extends Shape
{
    private int side;

    /**
     * Initializes the value of one of its side for later functions
     * @param side; Used to find Area and Perimeter
     */
    public ETriangle(int side)
    {
        super("ETriangle");
        this.side = side;
    }
    @Override
    /**
     * Takes the value from side in parent class and returns area of the triangle based on the value.
     * @return Returns the area of an ETriangle based on side's length
     */
    public double getArea()
    {
        return (Math.sqrt(3)/4) * side * side;
    }

    @Override
    /**
     *  Takes the value from side in parent class and returns perimeter of the triangle based on the value.
     * @return Returns the perimeter of an ETriangle based on side's length.
     */
    public double getPerimeter()
    {
        return side * 3;
    }
}
