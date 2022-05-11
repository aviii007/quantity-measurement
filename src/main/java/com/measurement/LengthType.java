package com.measurement;

public enum LengthType {
    FEET(1 * 12.0), INCH(1 / 12.0), YARD(1 * 36.0);

    public final double conversionUnit;

    LengthType(double conversionUnit) {
        this.conversionUnit = conversionUnit;
    }
}
