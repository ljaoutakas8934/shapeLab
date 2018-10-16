public class Rectangle extends Shape
{
    private int side;
    public Rectangle(int side)
    {
        super("Rectangle");
        this.side = side;
    }
    public double getArea()
    {
        return (side*side);
    }

    public double getPerimeter()
    {
        return side+side+side+side;
    }
}
