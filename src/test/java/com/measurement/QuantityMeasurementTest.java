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
}
