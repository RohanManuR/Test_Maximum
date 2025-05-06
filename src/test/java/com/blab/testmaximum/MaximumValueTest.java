package com.blab.testmaximum;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueTest {

    @Test
    public void checkMaxIntTestAtFirstPos()
    {
        MaximumValue maximumValue = new MaximumValue(100,10,5);
        Comparable actualValue = maximumValue.testMaximum();
       assertEquals(100,actualValue,"Testcase failed because excepted output is 100");

    }

    @Test
    public void checkMaxIntTestAtSecondPos()
    {
        MaximumValue maximumValue = new MaximumValue(25,250,40);
        Comparable actualValue = maximumValue.testMaximum();
        maximumValue.printMax(actualValue);
        assertEquals(250,actualValue,"Testcase failed because excepted output is 250");
    }

    @Test
    public void checkMaxIntTestAtThirdPos()
    {
        MaximumValue maximumValue = new MaximumValue(25,250,400);
        Comparable actualValue = maximumValue.testMaximum();
        maximumValue.printMax(actualValue);
        assertEquals(400,actualValue,"Testcase failed because excepted output is 400");
    }

    @Test
    public void checkMaxFloatTestAtFirstPos()
    {
        MaximumValue maximumValue = new MaximumValue(100.0f,25.0f,40.0f);
        Comparable actualValue = maximumValue.testMaximum();
        maximumValue.printMax(actualValue);
        assertEquals(100.0f,actualValue,"Testcase failed because excepted output is 100.0");
    }

    @Test
    public void checkMaxFloatTestAtSecondPos()
    {
        MaximumValue maximumValue = new MaximumValue(100.0f,250.0f,40.0f);
        Comparable actualValue = maximumValue.testMaximum();
        maximumValue.printMax(actualValue);
        assertEquals(250.0f,actualValue,"Testcase failed because excepted output is 250.0");
    }

    @Test
    public void checkMaxFloatTestAtThirdPos()
    {
        MaximumValue maximumValue = new MaximumValue(100.0f,250.0f,400.0f);
        Comparable actualValue = maximumValue.testMaximum();
        maximumValue.printMax(actualValue);
        assertEquals(400.0f,actualValue,"Testcase failed because excepted output is 400.0");
    }

    @Test
    public void checkMaxStringTestAtFirstPos()
    {
        MaximumValue maximumValue = new MaximumValue("Peach","Apple","Banana");
        Comparable actualValue = maximumValue.testMaximum();
        maximumValue.printMax(actualValue);
        assertEquals("Peach",actualValue,"Testcase failed because excepted output is Peach");
    }

    @Test
    public void checkMaxStringTestAtSecondPos()
    {
        MaximumValue maximumValue = new MaximumValue("Apple","Peach","Banana");
        Comparable actualValue = maximumValue.testMaximum();
        maximumValue.printMax(actualValue);
        assertEquals("Peach",actualValue,"Testcase failed because excepted output is Peach");
    }

    @Test
    public void checkMaxStringTestAtThirdPos()
    {
        MaximumValue maximumValue = new MaximumValue("Apple","Banana","Peach");
        Comparable actualValue = maximumValue.testMaximum();
        maximumValue.printMax(actualValue);
        assertEquals("Peach",actualValue,"Testcase failed because excepted output is Peach");
    }
}