package com.Ankita.QuantityMeasuremnet;

public enum MeasurementLength implements MeasurementUnits {

    FEET(12.0*2.54),
    INCH(2.54),
    YARD(2.54*3.0*12.0),
    CM(1.0);


    private final double convertion_value;

    MeasurementLength(double convertion_value) {
        this.convertion_value = convertion_value;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value*convertion_value;
    }

    @Override
    public boolean supportAddition() {
        return true;
    }

}
