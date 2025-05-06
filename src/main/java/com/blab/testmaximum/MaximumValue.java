package com.blab.testmaximum;

import java.util.Optional;

public class MaximumValue<E extends Comparable>
{
    E[] a;

    public MaximumValue(E... a) {
        this.a = a;
    }

    public  E testMaximum()
    {
        return findMaximum(a);
    }
    public static <E extends Comparable> E findMaximum(E... a)
    {
        E max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i].compareTo(max)>0)
                max = a[i];
        }
        return max;
    }


}
