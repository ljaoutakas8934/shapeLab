// Author Lin Yao Pan
public class ITriangle extends Shape
{
    private int side;
    private int base;
    public ITriangle(int side, int base)
    {
        super("ITriangle");
        this.side = side;
        this.base = base;
    }
    @Override
    /**
     * Takes the side and base values to calculate area of an ITriangle
     * @Return Returns area of ITriangle using side and base values
     */
    public double getArea()
    {
        return Math.sqrt(Math.pow(side,2) - Math.pow(base,2)/4) * base * .5;
    }

    @Override
    /**
     * Takes the side and base values to calculate perimeter of an ITriangle
     * @return Returns perimeter using side and base values
     */
    public double getPerimeter()
    {
        return side * 2 + base;
    }
}
