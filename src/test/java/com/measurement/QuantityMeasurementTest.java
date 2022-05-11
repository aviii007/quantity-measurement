package com.measurement;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {
    private static QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

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
}
