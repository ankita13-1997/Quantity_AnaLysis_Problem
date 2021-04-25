package com.Ankita.QuantityMeasuremnet;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTestClassForTemprature {

    @Test
    public void When0Celcius_AND_0CelciusShouldReturnEqual() {

        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.CELSIUS);
        QuantityMeasurement value2 = new QuantityMeasurement(0,MeasurementTemprature.CELSIUS);
        Assert.assertEquals(value1,value2);


    }

    @Test
    public void When0celsius_AND_nullShouldReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.CELSIUS);
        boolean checkEqual=value1.equals(null);
        Assert.assertFalse(checkEqual);
    }

    @Test
    public void When0celsius_AND_refrenceValueShouldReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.CELSIUS);
        boolean checkEqual=value1.equals(2.3);
        Assert.assertFalse(checkEqual);
    }

    @Test
    public void When1Celcius_AND_1CelciusShouldReturnTrue(){

        QuantityMeasurement value1 = new QuantityMeasurement(1,MeasurementTemprature.CELSIUS);
        QuantityMeasurement value2 = new QuantityMeasurement(1,MeasurementTemprature.CELSIUS);
        boolean checkEqual=value1.compare(value2);
        Assert.assertTrue(checkEqual);
    }

    @Test
    public void When0Farahneight_AND_0FarahneightShouldReturnEqual() {

        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.FAHARANEIT);
        QuantityMeasurement value2 = new QuantityMeasurement(0,MeasurementTemprature.FAHARANEIT);
        Assert.assertEquals(value1,value2);


    }

    @Test
    public void When0degreeF_AND_nullShouldReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.FAHARANEIT);
        boolean checkEqual=value1.equals(null);
        Assert.assertFalse(checkEqual);
    }

    @Test
    public void When0degreeF_AND_refrenceValueShouldReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.FAHARANEIT);
        boolean checkEqual=value1.equals(2.3);
        Assert.assertFalse(checkEqual);
    }

    @Test
    public void When1degreeF_AND_1degreeFShouldReturnTrue(){

        QuantityMeasurement value1 = new QuantityMeasurement(1,MeasurementTemprature.FAHARANEIT);
        QuantityMeasurement value2 = new QuantityMeasurement(1,MeasurementTemprature.FAHARANEIT);
        boolean checkEqual=value1.compare(value2);
        Assert.assertTrue(checkEqual);
    }



}
