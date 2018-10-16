public abstract class shape
{
    private String type;
    public shape (String type)
    {
        this.type = type;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString()
    {
        return ("I am a " + type + ".");
    }

}
