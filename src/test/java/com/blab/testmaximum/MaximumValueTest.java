package com.blab.testmaximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueTest {

    @Test
    public void checkMaxIntTestAtFirstPos()
    {
       Comparable actualValue = MaximumValue.findMaximum(100,25,40);
       assertEquals(100,actualValue,"Testcase failed because excepted output is 100");

    }

    @Test
    public void checkMaxIntTestAtSecondPos()
    {
        Comparable actualValue = MaximumValue.findMaximum(25,250,40);
        assertEquals(250,actualValue,"Testcase failed because excepted output is 250");
    }

    @Test
    public void checkMaxIntTestAtThirdPos()
    {
        Comparable actualValue = MaximumValue.findMaximum(25,250,400);
        assertEquals(400,actualValue,"Testcase failed because excepted output is 400");
    }

    @Test
    public void checkMaxFloatTestAtFirstPos()
    {
        Comparable actualValue = MaximumValue.findMaximum(100.0f,25.0f,40.0f);
        assertEquals(100.0f,actualValue,"Testcase failed because excepted output is 100.0");
    }

    @Test
    public void checkMaxFloatTestAtSecondPos()
    {
        Comparable actualValue = MaximumValue.findMaximum(100.0,250.0,40.0);
        assertEquals(250.0,actualValue,"Testcase failed because excepted output is 250.0");
    }

    @Test
    public void checkMaxFloatTestAtThirdPos()
    {
        Comparable actualValue = MaximumValue.findMaximum(100.0f,250.0f,400.0f);
        assertEquals(400.0f,actualValue,"Testcase failed because excepted output is 400.0");
    }

    @Test
    public void checkMaxStringTestAtFirstPos()
    {
        Comparable actualValue = MaximumValue.findMaximum("Peach","Apple","Banana");
        assertEquals("Peach",actualValue,"Testcase failed because excepted output is Peach");
    }

    @Test
    public void checkMaxStringTestAtSecondPos()
    {
        Comparable actualValue = MaximumValue.findMaximum("Apple","Peach","Banana");
        assertEquals("Peach",actualValue,"Testcase failed because excepted output is Peach");
    }

    @Test
    public void checkMaxStringTestAtThirdPos()
    {
        Comparable actualValue = MaximumValue.findMaximum("Apple","Banana","Peach");
        assertEquals("Peach",actualValue,"Testcase failed because excepted output is Peach");
    }
}