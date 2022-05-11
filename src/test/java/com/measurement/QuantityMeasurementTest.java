package com.measurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {
    private static QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    //Feet

    @Test
    public void given0FeetAnd0Feet_IfEqual_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.returnLengthType(LengthType.FEET, 0.0);
        double feet2 = quantityMeasurement.returnLengthType(LengthType.FEET, 0.0);
        assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void given0FeetAnd1Feet_IfNotEqual_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.returnLengthType(LengthType.FEET, 0.0);
        double feet2 = quantityMeasurement.returnLengthType(LengthType.FEET, 1.0);
        assertNotEquals(feet1, feet2, 0.0);
    }

    @Test
    public void givenNullValueForFeet_IfEqual_ShouldReturnFalse() {
        assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenReferenceForFeet_IfEqual_ShouldReturnTrue() {
        assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenType_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantity1 = new QuantityMeasurement();
        QuantityMeasurement quantity2 = new QuantityMeasurement();
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void givenValueCheck_IfEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.returnLengthType(LengthType.FEET, 2.2);
        double value2 = quantityMeasurement.returnLengthType(LengthType.FEET, 2.2);
        assertEquals(value1, value2, 0.0);
    }

    //inch

    @Test
    public void given0InchAnd0Inch_IfEqual_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.returnLengthType(LengthType.INCH, 0.0);
        double inch2 = quantityMeasurement.returnLengthType(LengthType.INCH, 0.0);
        assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0InchAnd1Inch_IfNotEqual_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.returnLengthType(LengthType.INCH, 0.0);
        double inch2 = quantityMeasurement.returnLengthType(LengthType.INCH, 1.0);
        assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenNullValueForInch_IfEqual_ShouldReturnFalse() {
        assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenReferenceForInch_IfEqual_ShouldReturnTrue() {
        assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenTypeForInch_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantity1 = new QuantityMeasurement();
        QuantityMeasurement quantity2 = new QuantityMeasurement();
        Assert.assertEquals(quantity1, quantity2);
    }
}
