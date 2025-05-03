package com.blab.testmaximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueTest {

    @Test
    public void checkMaxIntTestAtFirstPos()
    {
       int actualValue = MaximumValue.checkMaxInt(100,25,40);
       assertEquals(100,actualValue,"Testcase failed because excepted output is 100");

    }

    @Test
    public void checkMaxIntTestAtSecondPos()
    {
        int actualValue = MaximumValue.checkMaxInt(25,250,40);
        assertEquals(250,actualValue,"Testcase failed because excepted output is 250");
    }

    @Test
    public void checkMaxIntTestAtThirdPos()
    {
        int actualValue = MaximumValue.checkMaxInt(25,250,400);
        assertEquals(400,actualValue,"Testcase failed because excepted output is 400");
    }


}