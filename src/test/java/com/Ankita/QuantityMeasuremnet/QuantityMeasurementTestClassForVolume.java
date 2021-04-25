package com.Ankita.QuantityMeasuremnet;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTestClassForVolume {

    @Test
    public void When0Gallons_AND_0GallonsShouldReturnEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.GALLON);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementVolume.GALLON);
        Assert.assertEquals(value1,value2);

    }

    @Test
    public void When0Gallons_AND_NullShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.GALLON);
        boolean ischeck=value1.equals(null);
        Assert.assertFalse(ischeck);


    }

    @Test
    public void When0Gallons_AND_ReferenceValueShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.GALLON);
        boolean ischeck=value1.equals(0);
        Assert.assertFalse(ischeck);


    }

    @Test
    public void When0Gallons_AND_1GallonsShouldReturnNotEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.GALLON);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementVolume.GALLON);
        Assert.assertNotEquals(value1,value2);

    }

    @Test
    public void When0Liters_AND_0LitressShouldReturnNotEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.LITRE);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementVolume.LITRE);
        Assert.assertEquals(value1,value2);

    }

    @Test
    public void When0Liters_AND_nullValueShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.LITRE);
        boolean checkit=value1.equals(null);
        Assert.assertFalse(checkit);


    }

    @Test
    public void When0Liters_AND_refernceValueValueShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.LITRE);
        boolean checkit=value1.equals(0);
        Assert.assertFalse(checkit);


    }








}
