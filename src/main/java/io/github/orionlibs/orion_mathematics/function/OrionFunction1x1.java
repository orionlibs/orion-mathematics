package io.github.orionlibs.orion_mathematics.function;

@FunctionalInterface
public interface OrionFunction1x1<T1, R> extends OrionFunction
{
    R run(T1 t1);
}