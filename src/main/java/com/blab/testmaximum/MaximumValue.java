package com.blab.testmaximum;

public class MaximumValue {

    public static  <E extends Comparable> Comparable findMaximum(E a,E b,E c)
    {
        E max = a;
        if(max.compareTo(b)<0)
            max = b;
        if(max.compareTo(c)<0)
            max = c;
        return max;
    }

}
