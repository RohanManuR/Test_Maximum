package com.blab.testmaximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueTest {

    @Test
    public void checkMaxIntTestAtFirstPos()
    {
       int actualValue = MaximumValue.genericMethodForMaximum(100,25,40);
       assertEquals(100,actualValue,"Testcase failed because excepted output is 100");

    }

    @Test
    public void checkMaxIntTestAtSecondPos()
    {
        int actualValue = MaximumValue.genericMethodForMaximum(25,250,40);
        assertEquals(250,actualValue,"Testcase failed because excepted output is 250");
    }

    @Test
    public void checkMaxIntTestAtThirdPos()
    {
        int actualValue = MaximumValue.genericMethodForMaximum(25,250,400);
        assertEquals(400,actualValue,"Testcase failed because excepted output is 400");
    }

    @Test
    public void checkMaxFloatTestAtFirstPos()
    {
        Float actualValue = MaximumValue.genericMethodForMaximum(100.0f,25.0f,40.0f);
        assertEquals(100.0f,actualValue,"Testcase failed because excepted output is 100.0");
    }

    @Test
    public void checkMaxFloatTestAtSecondPos()
    {
        Float actualValue = MaximumValue.genericMethodForMaximum(100.0f,250.0f,40.0f);
        assertEquals(250.0f,actualValue,"Testcase failed because excepted output is 250.0");
    }

    @Test
    public void checkMaxFloatTestAtThirdPos()
    {
        Float actualValue = MaximumValue.genericMethodForMaximum(100.0f,250.0f,400.0f);
        assertEquals(400.0f,actualValue,"Testcase failed because excepted output is 400.0");
    }

    @Test
    public void checkMaxStringTestAtFirstPos()
    {
        String actualValue = MaximumValue.genericMethodForMaximum("Peach","Apple","Banana");
        assertEquals("Peach",actualValue,"Testcase failed because excepted output is Peach");
    }

    @Test
    public void checkMaxStringTestAtSecondPos()
    {
        String actualValue = MaximumValue.genericMethodForMaximum("Apple","Peach","Banana");
        assertEquals("Peach",actualValue,"Testcase failed because excepted output is Peach");
    }

    @Test
    public void checkMaxStringTestAtThirdPos()
    {
        String actualValue = MaximumValue.genericMethodForMaximum("Apple","Banana","Peach");
        assertEquals("Peach",actualValue,"Testcase failed because excepted output is Peach");
    }
}