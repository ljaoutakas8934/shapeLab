public class Rectangle extends Shape
{
    private int side1;
    private int side2;
    public Rectangle(int side1, int side2)
    {
        super("Rectangle");
        this.side1 = side1;
        this.side2 = side2;
    }
    public double getArea()
    {

        return (side1*side2);
    }

    public double getPerimeter()
    {
        return side1*side2;
    }
}
