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



}
