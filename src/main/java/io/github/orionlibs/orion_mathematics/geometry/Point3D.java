package io.github.orionlibs.orion_mathematics.geometry;

import io.github.orionlibs.orion_mathematics.utils.NumberArrayStream;

public class Point3D extends Point
{
    public Point3D(double x, double y, double z)
    {
        super(x, y, z);
    }


    public Point3D(double[] coordinates)
    {
        super(coordinates);
    }


    public Point3D(int dimensions)
    {
        super(dimensions);
    }


    public static Point3D of(double x, double y, double z)
    {
        return new Point3D(x, y, z);
    }


    public static Point3D of(double[] coordinates)
    {
        return new Point3D(coordinates);
    }


    public static Point3D of(int dimensions)
    {
        return new Point3D(dimensions);
    }


    public static Point3D ofZeroPoint()
    {
        return new Point3D(new double[] {0.0d, 0.0d, 0.0d});
    }


    public static Point3D ofZeroPoint(int dimensions)
    {
        double[] newCoordinates = new double[dimensions];
        NumberArrayStream.setZeroValue(newCoordinates);
        return Point3D.of(newCoordinates);
    }
}