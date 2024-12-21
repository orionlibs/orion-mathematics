package io.github.orionlibs.orion_mathematics;

import java.util.Random;
import java.util.random.RandomGenerator;

public class RandomNumberGenerator
{
    public static int generateInteger(int maximum)
    {
        if(maximum == 0)
        {
            return 0;
        }
        return Random.from(RandomGenerator.getDefault()).nextInt(maximum);
    }
}
