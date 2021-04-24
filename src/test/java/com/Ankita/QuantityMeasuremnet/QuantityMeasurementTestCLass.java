package com.Ankita.QuantityMeasuremnet;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTestCLass {

    @Test
    public void When0Feet_AND_0FeetShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);

        Assert.assertEquals(feet1, feet2);

    }

    @Test
    public void When0Feet_AND_nullShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        boolean checknullValue = feet1.equals(null);
        Assert.assertFalse(checknullValue);


    }

    @Test
    public void When0Feet_AND_VAlue_withReferencehouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        boolean checknullValue = feet1.equals(1);
        Assert.assertFalse(checknullValue);


    }

    @Test
    public void When0Feet_AND_1FeetReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);;
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);


    }

    @Test
    public void When0Inch_AND_0InchShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);

    }

    @Test
    public void When0Inch_AND_nullShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean check = inch1.equals(0);
        Assert.assertFalse(check);


    }

    @Test
    public void When0Inch_AND_referanceShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean check = inch1.equals(0);
        Assert.assertFalse(check);


    }

    @Test
    public void When0Inch_AND_1INchhouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);



    }

    @Test
    public void When0Inch_AND_1FeethouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,1);
        Length inch1 =new Length(Length.Unit.INCH,1);
        Assert.assertNotEquals(feet1,inch1);
    }

}