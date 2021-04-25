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
        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementWeight.KG);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementWeight.KG);
        Assert.assertEquals(value1,value2);

    }

    @Test
    public void When0grams_AND_0gramsShouldReturnEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementWeight.GRAM);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementWeight.GRAM);
        Assert.assertEquals(value1,value2);

    }

    @Test
    public void When0gram_AND_NullShouldReturnfalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementWeight.GRAM);
        boolean ischeck=value1.equals(null);
        Assert.assertFalse(ischeck);

    }

    @Test
    public void When0gram_AND_ReferenceValueShouldReturnfalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementWeight.GRAM);
        boolean ischeck=value1.equals(0);
        Assert.assertFalse(ischeck);

    }

    @Test
    public void When1gram_AND_1gramValueShouldReturnEQUAL(){
        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementWeight.KG);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementWeight.KG);
        Assert.assertEquals(value1,value2);

    }

    @Test
    public void When0Kilogram_AND_0gramValueShouldReturnTrue(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementWeight.KG);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementWeight.GRAM);
        boolean ischeck=value1.compare(value2);
        Assert.assertTrue(ischeck);


    }
    @Test
    public void When1Kilogram_AND_1gramValueShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementWeight.KG);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementWeight.GRAM);
        boolean ischeck=value1.compare(value2);
        Assert.assertFalse(ischeck);


    }

    @Test
    public void When1Kilogram_AND_1000gramValueShouldReturnTrue(){
        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementWeight.KG);
        QuantityMeasurement value2 =new QuantityMeasurement(1000,MeasurementWeight.GRAM);
        boolean ischeck=value1.compare(value2);
        Assert.assertTrue(ischeck);


    }

    @Test
    public void When0Tone_AND_0ToneShouldReturnEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementWeight.TONE);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementWeight.TONE);
        Assert.assertEquals(value1,value2);

    }

    @Test
    public void When0Tones_AND_NullShouldReturnfalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementWeight.TONE);
        boolean ischeck=value1.equals(null);
        Assert.assertFalse(ischeck);

    }

    @Test
    public void When0Tone_AND_ReferenceValueShouldReturnfalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementWeight.TONE);
        boolean ischeck=value1.equals(0);
        Assert.assertFalse(ischeck);

    }

    @Test
    public void When1Tone_AND_1ToneValueShouldReturnEQUAL(){
        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementWeight.TONE);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementWeight.TONE);
        Assert.assertEquals(value1,value2);

    }

}