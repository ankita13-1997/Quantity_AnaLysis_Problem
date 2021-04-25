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

    @Test
    public void When0Kg_AND_NullShouldReturnfalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementWeight.KG);
        boolean ischeck=value1.equals(null);
        Assert.assertFalse(ischeck);

    }

    @Test
    public void When0Kg_AND_ReferenceValueShouldReturnfalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementWeight.KG);
        boolean ischeck=value1.equals(0);
        Assert.assertFalse(ischeck);

    }

    @Test
    public void When1kg_AND_1kgValueShouldReturnEQUAL(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementWeight.KG);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementWeight.KG);
        Assert.assertNotEquals(value1,value2);

    }


}
