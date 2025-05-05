package com.blab.testmaximum;

public class MaximumValue<E extends Comparable>
{
    E a,b,c;

    public MaximumValue(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  E testMaximum()
    {
        return findMaximum(a,b,c);
    }
    public static <E extends Comparable> E findMaximum(E a, E b, E c)
    {
        E max = a;
        if(max.compareTo(b)<0)
            max = b;
        if(max.compareTo(c)<0)
            max = c;
        return max;
    }

}
