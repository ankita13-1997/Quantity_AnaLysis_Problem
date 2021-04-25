package com.Ankita.QuantityMeasuremnet;

import java.util.function.Function;

public enum MeasurementTemprature implements MeasurementUnits{

    FAHARANEIT(true),
    CELSIUS(false);

    final Function<Double,Double> degFToCelcius = (Double degF) -> (degF.doubleValue() -32)*5/9;
    final Function<Double,Double> degCToCelcius = (Double degC) ->  degC.doubleValue();

     final Function<Double,Double> convertion_value;

      private MeasurementTemprature(boolean isFarahniet) {
        if (isFarahniet) this.convertion_value=degFToCelcius;
        else this.convertion_value=degCToCelcius;
      }

    @Override
    public double convertToBaseUnit(double value) {
        return convertion_value.apply(value);
    }

    @Override
    public boolean supportAddition() {
        return false;
    }
}
