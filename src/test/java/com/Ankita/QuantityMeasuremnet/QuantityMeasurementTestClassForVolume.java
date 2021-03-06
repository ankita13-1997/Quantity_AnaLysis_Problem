package com.Ankita.QuantityMeasuremnet;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTestClassForVolume {

    @Test
    public void GivenWhen0Gallons_AND_0GallonsShouldReturnEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.GALLON);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementVolume.GALLON);
        Assert.assertEquals(value1,value2);

    }

    @Test
    public void GivenWhen0Gallons_AND_NullShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.GALLON);
        boolean ischeck=value1.equals(null);
        Assert.assertFalse(ischeck);


    }

    @Test
    public void GivenWhen0Gallons_AND_ReferenceValueShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.GALLON);
        boolean ischeck=value1.equals(0);
        Assert.assertFalse(ischeck);


    }

    @Test
    public void GivenWhen0Gallons_AND_1GallonsShouldReturnNotEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.GALLON);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementVolume.GALLON);
        Assert.assertNotEquals(value1,value2);

    }

    @Test
    public void GivenWhen0Liters_AND_0LitressShouldReturnEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.LITRE);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementVolume.LITRE);
        Assert.assertEquals(value1,value2);

    }

    @Test
    public void GivenWhen0Liters_AND_nullValueShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.LITRE);
        boolean checkit=value1.equals(null);
        Assert.assertFalse(checkit);


    }

    @Test
    public void GivenWhen0Liters_AND_refernceValueValueShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.LITRE);
        boolean checkit=value1.equals(0);
        Assert.assertFalse(checkit);


    }

    @Test
    public void GivenWhen0Litre_AND_1LitreShouldReturnNotEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.LITRE);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementVolume.LITRE);
        Assert.assertNotEquals(value1,value2);

    }

    @Test
    public void GivenWhen0gallons_AND_0litreShouldReturnEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.GALLON);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementVolume.LITRE);
        boolean checkit=value1.compare(value2);
        Assert.assertTrue(checkit);

    }

    @Test
    public void GivenWhen1gallons_AND_1litreShouldReturnNotEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementVolume.GALLON);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementVolume.LITRE);
        boolean checkit=value1.compare(value2);
        Assert.assertFalse(checkit);

    }

    @Test
    public void GivenWhen1gallons_AND_3point78litreShouldReturnEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementVolume.GALLON);
        QuantityMeasurement value2 =new QuantityMeasurement(3.78,MeasurementVolume.LITRE);
        boolean checkit=value1.compare(value2);
        Assert.assertTrue(checkit);

    }

    /*----------------------------------------------------------------------------------------------------------*/

    @Test
    public void GivenWhen0ML_AND_0MLShouldReturnEqual(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.MILLILITER);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementVolume.MILLILITER);
        Assert.assertEquals(value1,value2);

    }

    @Test
    public void GivenWhen0ML_AND_nullValueShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.MILLILITER);
        boolean checkIt = value1.equals(null);
        Assert.assertFalse(checkIt);
    }

    @Test
    public void GivenWhen0ML_AND_ReferenceValueShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.MILLILITER);
        boolean checkIt = value1.equals(0);
        Assert.assertFalse(checkIt);
    }

    @Test
    public void GivenWhen1ML_AND_1MLShouldReturnTrue(){
        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementVolume.MILLILITER);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementVolume.MILLILITER);
        boolean checkIt = value1.compare(value2);
        Assert.assertTrue(checkIt);
    }

    @Test
    public void GivenWhen0L_AND_0MLShouldReturnTrue(){
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementVolume.LITRE);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementVolume.MILLILITER);
        boolean checkIt = value1.compare(value2);
        Assert.assertTrue(checkIt);
    }

    @Test
    public void GivenWhen1L_AND_1MLShouldReturnFalse(){
        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementVolume.LITRE);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementVolume.MILLILITER);
        boolean checkIt = value1.compare(value2);
        Assert.assertFalse(checkIt);
    }

    @Test
    public void GivenWhen1L_AND_1000MLShouldReturnTrue(){
        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementVolume.LITRE);
        QuantityMeasurement value2 =new QuantityMeasurement(1000,MeasurementVolume.MILLILITER);
        boolean checkIt = value1.compare(value2);
        Assert.assertTrue(checkIt);
    }
















}
