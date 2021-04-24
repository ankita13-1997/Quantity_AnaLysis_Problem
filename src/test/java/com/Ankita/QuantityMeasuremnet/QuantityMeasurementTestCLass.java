package com.Ankita.QuantityMeasuremnet;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTestCLass {

    @Test
    public void When0Feet_AND_0FeetShouldReturnEqual(){
       Feet feet1= new Feet(0.0);
       Feet feet2 =new Feet(0.0);

        Assert.assertEquals(feet1,feet2);

    }
    @Test
    public void When0Feet_AND_nullShouldReturnEqual(){
        Feet feet1= new Feet(0.0);
        boolean checknullValue=feet1.equals(null);
        Assert.assertFalse(checknullValue);



    }

    @Test
    public void When0Feet_AND_VAlue_withReferencehouldReturnEqual(){
        Feet feet1= new Feet(0.0);
        boolean checknullValue=feet1.equals(1);
        Assert.assertFalse(checknullValue);



    }

    @Test
    public void When0Feet_AND_1FeetReturnEqual(){
        Feet feet1= new Feet(0.0);
        Feet feet2=new Feet(1.2);
        Assert.assertNotEquals(feet1,feet2);




    }
}
