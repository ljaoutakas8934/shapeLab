public class Square extends Shape {
    private int side ;
    /**
     * initializes the parameters of the rectangle
     * @param side side length 1
     */
    public Square(int side)
    {
        super("Square");
        this.side = side;
    }

    /**
     * multiplies side by itself because they are equivalent in
     * @return returns product of side lengths which is area
     */
    public double getArea()
    {

        return (side*side);
    }

    /**
     * multiplies the side by 4 to essentially calculate the sum of the side lengths
     * @return returns perimeter of a square
     */
    public double getPerimeter()
    {
        return (4*side);
    }
}

