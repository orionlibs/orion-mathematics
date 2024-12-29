package io.github.orionlibs.orion_mathematics.geometry;

public class Axis
{
    private String name;
    private Point origin;


    public Axis(String name, Point origin)
    {
        this.name = name;
        if(origin != null)
        {
            this.origin = origin;
        }
        else
        {
            this.origin = Point.ofZeroPoint(3);
        }
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public Point getOrigin()
    {
        return origin;
    }


    public void setOrigin(Point origin)
    {
        this.origin = origin;
    }
}
