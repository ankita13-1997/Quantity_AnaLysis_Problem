package com.Ankita.QuantityMeasuremnet;

import org.junit.Assert;
import org.junit.Test;

public class QuantityyMeasurementTestClassForWeight {
    @Test
    public void When0Kg_AND_0KgShouldReturnEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementWeight.KG);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementWeight.KG);
        Assert.assertEquals(value1,value2);

    }


}
