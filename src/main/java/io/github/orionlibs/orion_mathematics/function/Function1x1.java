package io.github.orionlibs.orion_mathematics.function;

public class Function1x1<T1, R> extends Function
{
    public Function1x1(Function1x1IF<T1, R> function)
    {
        super(function);
    }


    public static <T1, R> Function1x1<T1, R> of(Function1x1IF<T1, R> function)
    {
        return new Function1x1<T1, R>(function);
    }


    @SuppressWarnings("unchecked")
    public R run(T1 value)
    {
        return ((Function1x1IF<T1, R>)getFunction()).run(value);
    }


    @SuppressWarnings("unchecked")
    public Function1x1IF<T1, R> getFunctionCasted()
    {
        return (Function1x1IF<T1, R>)getFunction();
    }
}