package com.Ankita.QuantityMeasuremnet;

public enum MeasurementVolume implements MeasurementUnits{
   GALLON(3.78),
   LITRE(1);

    private final double convertion_value;

    MeasurementVolume(double convertion_value) {
        this.convertion_value = convertion_value;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value*convertion_value;
    }

    @Override
    public boolean supportAddition() {
        return false;
    }
}
