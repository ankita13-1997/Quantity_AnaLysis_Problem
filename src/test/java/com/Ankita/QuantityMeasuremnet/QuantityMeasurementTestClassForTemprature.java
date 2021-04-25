package com.Ankita.QuantityMeasuremnet;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTestClassForTemprature {

    @Test
    public void When0Celcius_AND_0CelciusShouldReturnTrue() {

        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.CELSIUS);
        QuantityMeasurement value2 = new QuantityMeasurement(0,MeasurementTemprature.CELSIUS);
        Assert.assertEquals(value1,value2);


    }
}
