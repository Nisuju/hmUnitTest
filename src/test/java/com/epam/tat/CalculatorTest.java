package com.epam.tat;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CalculatorTest {
    private Calculator calculator;

    @BeforeClass
    public void initCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void sumLongTest() {
        long result = calculator.sum(5L, 10L);
        Assert.assertEquals(result, 15L);
    }

    @Test
    public void sumDoubleTest() {
        double result = calculator.sum(7.0d, 100.1d);
        Assert.assertEquals(result, 107.1d);
    }

    @Test
    public void subLongTest() {
        long result = calculator.sub(25L, 30L);
        Assert.assertEquals(result, -5L);

    }

    @Test
    public void subDoubleTest() {
        double result = calculator.sub(25.5d, 30.6d);
        Assert.assertEquals(result, -5.1d);

    }

    @Test
    public void multLongTest() {
        long result = calculator.mult(40L, 20L);
        Assert.assertEquals(result, 800L);
    }

    @Test
    public void multDoubleTest() {
        double result = calculator.mult(5.4d, 2.3d);
        Assert.assertEquals(result, 12.42d);
    }

    @Test
    public void divLongWithoutZeroTest() {
        double result = calculator.div(10L, 4L);
        Assert.assertEquals(result, 2.5d);

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divLongWithZeroTest() {
        calculator.div(5L, 0L);

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divDoubleTest() {
        calculator.div(5.2d, 0);
    }

    @Test
    public void powTest() {
        double result = calculator.pow(25.2d, 2d);
        Assert.assertEquals(result, 635.04d);
    }

    @Test
    public void sqrtTest() {
        double result = calculator.sqrt(5.4286d);
        Assert.assertEquals(result, 2.33d);
    }

    @Test
    public void tgTest() {
        double result = calculator.tg(180.0d);
        Assert.assertEquals(result, 0.0d);

    }

    @Test
    public void ctgTest() {
        double result = calculator.ctg(45.0d);
        Assert.assertEquals(result, 1.0d);
    }

    @Test
    public void cosTest() {
        double result = calculator.cos(60.0d);
        Assert.assertEquals(result, 0.5d);
    }

    @Test
    public void sinTest() {
        double result = calculator.sin(90.0d);
        Assert.assertEquals(result, 1.0d);
    }

    @Test
    public void isPositiveTest() {
        boolean result = calculator.isPositive(-5L);
        Assert.assertEquals(result, false);
    }

    @Test
    public void isPositiveZeroTest() {
        boolean result = calculator.isPositive(0L);
        Assert.assertEquals(result, false);
    }

    @Test
    public void isNegativeTest() {
        boolean result = calculator.isNegative(-5L);
        Assert.assertEquals(result, true);
    }

    @Test
    public void isNegativeZeroTest() {
        boolean result = calculator.isNegative(0L);
        Assert.assertEquals(result, false);
    }


}
