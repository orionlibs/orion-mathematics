package io.github.orionlibs.orion_mathematics.function;

public class Function2x1<T1, T2, R> extends Function
{
    public Function2x1(Function2x1IF<T1, T2, R> function)
    {
        super(function);
    }


    public static <T1, T2, R> Function2x1<T1, T2, R> of(Function2x1IF<T1, T2, R> function)
    {
        return new Function2x1<T1, T2, R>(function);
    }


    @SuppressWarnings("unchecked")
    public R run(T1 value1, T2 value2)
    {
        return ((Function2x1IF<T1, T2, R>)getFunction()).run(value1, value2);
    }


    @SuppressWarnings("unchecked")
    public Function2x1IF<T1, T2, R> getFunctionCasted()
    {
        return (Function2x1IF<T1, T2, R>)getFunction();
    }
}