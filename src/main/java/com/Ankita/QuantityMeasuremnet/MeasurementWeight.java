package com.Ankita.QuantityMeasuremnet;

public enum MeasurementWeight implements MeasurementUnits {
    KG(1000),
    GRAM(1);

    private final double convertion_value;

    MeasurementWeight(double convertion_value) {
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
