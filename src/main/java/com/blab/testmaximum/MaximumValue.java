package com.blab.testmaximum;

public class MaximumValue {

    public static int checkMaxInt(Integer a,Integer b,Integer c)
    {
        Integer max = a;
        if(max.compareTo(b)<0)
            max = b;
        if(max.compareTo(c)<0)
            max = c;
        return max;
    }
}
