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

}