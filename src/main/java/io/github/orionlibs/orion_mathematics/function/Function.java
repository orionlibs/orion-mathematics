package io.github.orionlibs.orion_mathematics.function;

public class Function
{
    private OrionFunction function;


    public Function()
    {
    }


    public Function(OrionFunction function)
    {
        this.function = function;
    }


    public static Function of(OrionFunction function)
    {
        return new Function(function);
    }


    public OrionFunction getFunction()
    {
        return this.function;
    }


    protected void setFunction(OrionFunction function)
    {
        this.function = function;
    }
}