public class Ellipse
{
    private int a ;
    private int b;

    /**
     * initializes the parameters of the rectangle
     * @param a side length 1
     * @param b  side length 2
     */
    public Ellipse(int a, int b)
    {
        super("Ellipse");
        this.a = a;
        this.b  = b;
    }

    /**
     * multiplies the two side lengths to obtain area
     * @return returns product of side lengths which is area
     */
    public double getArea()
    {

        return Math.PI*(a*b);
    }

    /**
     * uses the equation to find the perimeter of an ellipse
     * @return returns sum of all four side lengths
     */
    public double getPerimeter()
    {
        return (2*Math.PI*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2));
    }
}
