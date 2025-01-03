package io.github.orionlibs.orion_mathematics.function;

@FunctionalInterface
public interface OrionFunction2x1<T1, T2, R> extends OrionFunction
{
    R run(T1 t1, T2 t2);
}