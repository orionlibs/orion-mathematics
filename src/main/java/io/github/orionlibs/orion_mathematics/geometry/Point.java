package io.github.orionlibs.orion_mathematics.geometry;

import io.github.orionlibs.orion_mathematics.utils.NumberArrayStream;

public class Point
{
    private double[] coordinates;


    public Point(double x)
    {
        this.coordinates = new double[] {x};
    }


    public Point(double x, double y)
    {
        this.coordinates = new double[] {x, y};
    }


    public Point(double x, double y, double z)
    {
        this.coordinates = new double[] {x, y, z};
    }


    public Point(double[] coordinates)
    {
        this.coordinates = coordinates;
    }


    public Point(int dimensions)
    {
        double[] pointCoordinates = new double[dimensions];
        NumberArrayStream.setZeroValue(pointCoordinates);
        this.coordinates = pointCoordinates;
    }


    public static Point of(double x)
    {
        return new Point(x);
    }


    public static Point of(double x, double y)
    {
        return new Point(x, y);
    }


    public static Point of(double x, double y, double z)
    {
        return new Point(x, y, z);
    }


    public static Point of(double[] coordinates)
    {
        return new Point(coordinates);
    }


    public static Point of(int dimensions)
    {
        return new Point(dimensions);
    }


    public static Point ofZeroPoint()
    {
        return new Point(new double[] {0.0d, 0.0d, 0.0d});
    }


    public static Point ofZeroPoint(int dimensions)
    {
        double[] newCoordinates = new double[dimensions];
        NumberArrayStream.setZeroValue(newCoordinates);
        return Point.of(newCoordinates);
    }


    public double get(int index)
    {
        return getCoordinates()[index];
    }


    public void set(int index, double element)
    {
        getCoordinates()[index] = element;
    }


    public int getDimensions()
    {
        return coordinates.length;
    }


    public double getX()
    {
        return (getDimensions() == 0) ? null : coordinates[0];
    }


    public double getY()
    {
        return (getDimensions() <= 1) ? null : coordinates[1];
    }


    public double getZ()
    {
        return (getDimensions() <= 2) ? null : coordinates[2];
    }


    public double[] getCoordinates()
    {
        return this.coordinates;
    }
}