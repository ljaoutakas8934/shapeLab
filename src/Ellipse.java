/**
 * Author Loris Jautakas
 * This class is used to create an ellipse with two axis that can be inputted.
 */
public class Ellipse extends Shape
{
    private int a ;
    private int b;

    /**
     * initializes the parameters of the Ellipse
     * @param a Major Axis
     * @param b  Minor Axis
     */
    public Ellipse(int a, int b)
    {
        super("Ellipse");
        this.a = a;
        this.b  = b;
    }

    /**
     * Finds the equation of an ellipse
     * @return returns product of side lengths which is area
     */
    public double getArea()
    {

        return Math.PI*(a*b);
    }

    /**
     * uses the equation to find the perimeter of an ellipse
     * @return returns the perimeter of an ellipse
     */
    public double getPerimeter()
    {
        return (2*Math.PI*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2));
    }
}
