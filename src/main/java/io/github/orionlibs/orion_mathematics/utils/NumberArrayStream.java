package io.github.orionlibs.orion_mathematics.utils;

public class NumberArrayStream extends OrionArrays
{
    public static void negateAll(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = -array[i];
        }
    }


    public static void setValue(double[] array, double x)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = x;
        }
    }


    public static void setZeroValue(double[] array)
    {
        setValue(array, 0.0d);
    }


    public static boolean hasZeroValues(double[] array)
    {
        if(array != null && array.length > 0)
        {
            for(int i = 0; i < array.length; i++)
            {
                if(array[i] != 0.0d)
                {
                    return false;
                }
            }
        }
        return true;
    }
}