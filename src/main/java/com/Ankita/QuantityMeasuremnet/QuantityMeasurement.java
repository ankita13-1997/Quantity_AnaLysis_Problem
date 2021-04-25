package com.Ankita.QuantityMeasuremnet;

import java.util.Objects;

public class QuantityMeasurement {

    private  double value;
    private MeasurementUnits units;

    public QuantityMeasurement(double value, MeasurementUnits units) {
        this.value = value;
        this.units = units;
    }

    public boolean compare(QuantityMeasurement thatUnitValue){
        if (this.units.getClass() != thatUnitValue.units.getClass())
            return false;
        if (this.units.equals(thatUnitValue.units))
            return this.equals(thatUnitValue);

        return Double.compare(this.units.convertToBaseUnit(this.value),
                thatUnitValue.units.convertToBaseUnit(thatUnitValue.value))==0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 && Objects.equals(units, that.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, units);
    }
}
