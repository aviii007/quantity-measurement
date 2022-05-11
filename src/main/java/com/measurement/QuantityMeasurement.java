package com.measurement;

public class QuantityMeasurement {
    public double returnLengthType(LengthType type, double unit) {
        return unit * type.conversionUnit;
    }
}
