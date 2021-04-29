package com.Ankita.QuantityMeasuremnet;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTestClassForTemprature {

    @Test
    public void GivenWhen0Celcius_AND_0CelciusShouldReturnEqual() {

        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.CELSIUS);
        QuantityMeasurement value2 = new QuantityMeasurement(0,MeasurementTemprature.CELSIUS);
        Assert.assertEquals(value1,value2);


    }

    @Test
    public void GivenWhen0celsius_AND_nullShouldReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.CELSIUS);
        boolean checkEqual=value1.equals(null);
        Assert.assertFalse(checkEqual);
    }

    @Test
    public void GivenWhen0celsius_AND_refrenceValueShouldReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.CELSIUS);
        boolean checkEqual=value1.equals(2.3);
        Assert.assertFalse(checkEqual);
    }

    @Test
    public void GivenWhen1Celcius_AND_1CelciusShouldReturnTrue(){

        QuantityMeasurement value1 = new QuantityMeasurement(1,MeasurementTemprature.CELSIUS);
        QuantityMeasurement value2 = new QuantityMeasurement(1,MeasurementTemprature.CELSIUS);
        boolean checkEqual=value1.compare(value2);
        Assert.assertTrue(checkEqual);
    }

    @Test
    public void GivenWhen0Farahneight_AND_0FarahneightShouldReturnEqual() {

        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.FAHARANEIT);
        QuantityMeasurement value2 = new QuantityMeasurement(0,MeasurementTemprature.FAHARANEIT);
        Assert.assertEquals(value1,value2);


    }

    @Test
    public void GivenWhen0degreeF_AND_nullShouldReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.FAHARANEIT);
        boolean checkEqual=value1.equals(null);
        Assert.assertFalse(checkEqual);
    }

    @Test
    public void GivenWhen0degreeF_AND_refrenceValueShouldReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.FAHARANEIT);
        boolean checkEqual=value1.equals(2.3);
        Assert.assertFalse(checkEqual);
    }

    @Test
    public void WhGivenen1degreeF_AND_1degreeFShouldReturnTrue(){

        QuantityMeasurement value1 = new QuantityMeasurement(1,MeasurementTemprature.FAHARANEIT);
        QuantityMeasurement value2 = new QuantityMeasurement(1,MeasurementTemprature.FAHARANEIT);
        boolean checkEqual=value1.compare(value2);
        Assert.assertTrue(checkEqual);
    }

    @Test
    public void GivenWhen0degreeF_AND_0degreeCShouldReturnFalse(){

        QuantityMeasurement value1 = new QuantityMeasurement(0,MeasurementTemprature.FAHARANEIT);
        QuantityMeasurement value2 = new QuantityMeasurement(0,MeasurementTemprature.CELSIUS);
        boolean checkEqual=value1.compare(value2);
        Assert.assertFalse(checkEqual);
    }

    @Test
    public void GivenWhen212degreeF_AND_100degreeC_ShouldReturnTrue(){

        QuantityMeasurement value1 = new QuantityMeasurement(212,MeasurementTemprature.FAHARANEIT);
        QuantityMeasurement value2 = new QuantityMeasurement(100,MeasurementTemprature.CELSIUS);
        boolean checkEqual=value1.compare(value2);
        Assert.assertTrue(checkEqual);
    }





}
