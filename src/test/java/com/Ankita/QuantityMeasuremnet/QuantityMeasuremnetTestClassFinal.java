package com.Ankita.QuantityMeasuremnet;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasuremnetTestClassFinal {

    @Test
    public void When0Feet_AND_0FeetShouldReturnTrue() {
        QuantityMeasurement feet1 =new QuantityMeasurement(0,MeasurementLength.FEET);
        QuantityMeasurement feet2 =new QuantityMeasurement(0,MeasurementLength.FEET);
        boolean checkEqual= feet1.compare(feet2);
        Assert.assertTrue(checkEqual);
    }
    @Test
    public void When0Feet_AND_nullShouldReturnFalse() {
        QuantityMeasurement feet1 =new QuantityMeasurement(0,MeasurementLength.FEET);
        boolean checkEqual=feet1.equals(null);
        Assert.assertFalse(checkEqual);
    }


    @Test
    public void When0Feet_AND_ReferenceShouldReturnFalse() {
        QuantityMeasurement feet1 =new QuantityMeasurement(0,MeasurementLength.FEET);
        boolean checkEqual=feet1.equals(0);
        Assert.assertFalse(checkEqual);
    }

    @Test
    public void When0Feet_AND_1FeetShouldReturnNotEQUAL() {
        QuantityMeasurement feet1 =new QuantityMeasurement(0,MeasurementLength.FEET);
        QuantityMeasurement feet2 =new QuantityMeasurement(1,MeasurementLength.FEET);
        Assert.assertNotEquals(feet1,feet2);

    }

    @Test
    public void When0Inch_AND_0InchShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(0,MeasurementLength.INCH);
        QuantityMeasurement inch2 = new QuantityMeasurement(0,MeasurementLength.INCH);
        Assert.assertEquals(inch1, inch2);

    }


    @Test
    public void When0Inch_AND_NUllShouldReturnFalse() {
        QuantityMeasurement inch1 = new QuantityMeasurement(0,MeasurementLength.INCH);
        boolean isCheck=inch1.equals(null);
        Assert.assertFalse(isCheck);

    }

    @Test
    public void When0Inch_AND_ReferenceShouldReturnFalse() {
        QuantityMeasurement inch1 = new QuantityMeasurement(0,MeasurementLength.INCH);
        boolean isCheck=inch1.equals(0);
        Assert.assertFalse(isCheck);

    }

    @Test
    public void When0Inch_AND_1InchShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(0,MeasurementLength.INCH);
        QuantityMeasurement inch2 = new QuantityMeasurement(1,MeasurementLength.INCH);
        Assert.assertNotEquals(inch1, inch2);

    }


    @Test
    public void When0Feet_AND_OInchShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(0,MeasurementLength.FEET);
        QuantityMeasurement inch2 = new QuantityMeasurement(0,MeasurementLength.INCH);
        boolean checkIt = feet1.compare(inch2);
        Assert.assertTrue(checkIt);

    }

    @Test
    public void When1Feet_AND_1InchShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(1,MeasurementLength.FEET);
        QuantityMeasurement inch2 = new QuantityMeasurement(1,MeasurementLength.INCH);
        boolean checkIt = feet1.compare(inch2);
        Assert.assertFalse(checkIt);

    }

    @Test
    public void When1Feet_AND_12InchShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(1,MeasurementLength.FEET);
        QuantityMeasurement inch2 = new QuantityMeasurement(12,MeasurementLength.INCH);
        boolean checkIt = feet1.compare(inch2);
        Assert.assertTrue(checkIt);

    }

    @Test
    public void When0yard_AND_0YardShouldReturnEquals() {
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementLength.YARD);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementLength.YARD);
        Assert.assertEquals(value1,value2);
    }

    @Test
    public void When0yard_AND_nullShouldReturnFalse() {
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementLength.YARD);
        boolean checkIt = value1.equals(null);
        Assert.assertFalse(checkIt);
    }
    @Test
    public void When0yard_AND_ReferenceShouldReturnFalse() {
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementLength.YARD);
        boolean checkIt = value1.equals(0);
        Assert.assertFalse(checkIt);
    }

    @Test
    public void When0yard_AND_1YardShouldReturnNotEquals() {
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementLength.YARD);
        QuantityMeasurement value2 =new QuantityMeasurement(1,MeasurementLength.YARD);
        Assert.assertNotEquals(value1,value2);
    }


    @Test
    public void When0Feet_Equals_0YardShouldReturnTrue() {
        QuantityMeasurement value1 =new QuantityMeasurement(0,MeasurementLength.FEET);
        QuantityMeasurement value2 =new QuantityMeasurement(0,MeasurementLength.YARD);
        boolean checkIt=value1.compare(value2);
        Assert.assertTrue(checkIt);
    }





}
