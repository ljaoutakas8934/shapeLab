/**
 * Author: Loris Jautakas
 * This class is used to create a circle with a radius that can be inputted.
 */
public class Circle extends Shape
{
    private int radius;

    /**
     *  This function sets the value of the private int radius to the radius parameter that can be inputted.
     * @param radius The radius parameter is what is changed in the runner class.
     */
    public Circle (int radius)
    {
        super("Circle");
        this.radius = radius;
    }
    @Override
    /**
     * This method uses the radius established previously to get the area of a circle.
     * @return Returns the area of a circle.
     */
    public double getArea()
    {
        return (Math.PI*Math.pow(radius,2));
    }

    @Override
    /**
     * This method finds the circumference of a circle with a given radius, established previously.
     * @return Returns the circumference of a circle.
     */
    public double getPerimeter()
    {
        return Math.PI*(radius*2);
    }
}
