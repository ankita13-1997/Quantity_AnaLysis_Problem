package com.Ankita.QuantityMeasuremnet;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementAddition {
    Boolean n =false;
    @Test
    public void given_2in_and2inch_add_give4inch(){

        QuantityMeasurement value1 =new QuantityMeasurement(2.0,MeasurementLength.INCH);
        QuantityMeasurement value2 =new QuantityMeasurement(2.0,MeasurementLength.INCH);
        QuantityMeasurement Exp_result =new QuantityMeasurement(4.0,MeasurementLength.INCH);
        double  calculatedValue = value1.addValues(value2);
        QuantityMeasurement result =new QuantityMeasurement(calculatedValue,MeasurementLength.CM);
        boolean checkIt=result.compare(Exp_result);
        Assert.assertTrue(checkIt);



    }
    @Test
    public void given_1feet_and2inch_add_give14inch(){
        QuantityMeasurement value1 =new QuantityMeasurement(1.0,MeasurementLength.FEET);
        QuantityMeasurement value2 =new QuantityMeasurement(2.0,MeasurementLength.INCH);
        QuantityMeasurement Exp_result =new QuantityMeasurement(14.0,MeasurementLength.INCH);
        double  calculatedValue = value1.addValues(value2);
        QuantityMeasurement result =new QuantityMeasurement(calculatedValue,MeasurementLength.CM);
        boolean checkIt=result.compare(Exp_result);
        Assert.assertTrue(checkIt);

    }

    @Test
    public void given_1feet_and1feet_add_give24inch(){

        QuantityMeasurement value1 =new QuantityMeasurement(1.0,MeasurementLength.FEET);
        QuantityMeasurement value2 =new QuantityMeasurement(1.0,MeasurementLength.FEET);
        QuantityMeasurement Exp_result =new QuantityMeasurement(24.0,MeasurementLength.INCH);
        double  calculatedValue = value1.addValues(value2);
        QuantityMeasurement result =new QuantityMeasurement(calculatedValue,MeasurementLength.CM);
        boolean checkIt=result.compare(Exp_result);
        Assert.assertTrue(checkIt);
    }

    @Test
    public void given_2inch_and2point5cm_add_give3inch(){

        QuantityMeasurement value1 =new QuantityMeasurement(2.0,MeasurementLength.INCH);
        QuantityMeasurement value2 =new QuantityMeasurement(2.5,MeasurementLength.CM);
        QuantityMeasurement Exp_result =new QuantityMeasurement(2.98452,MeasurementLength.INCH);
        double  calculatedValue = value2.addValues(value1);
        System.out.println(calculatedValue);
        QuantityMeasurement result =new QuantityMeasurement(calculatedValue,MeasurementLength.CM);
        boolean checkIt=result.compare(Exp_result);
        Assert.assertFalse(checkIt);
    }

    @Test
    public void given_1gallon_and3point78lt_add_give7point57inch(){

        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementVolume.GALLON);
        QuantityMeasurement value2 =new QuantityMeasurement(3.78,MeasurementVolume.LITRE);
        QuantityMeasurement Exp_result =new QuantityMeasurement(7.56,MeasurementVolume.LITRE);
        double  calculatedValue = value2.addValues(value1);
        System.out.println(calculatedValue);
        QuantityMeasurement result =new QuantityMeasurement(calculatedValue,MeasurementVolume.MILLILITER);
        boolean checkIt=result.compare(Exp_result);
        Assert.assertTrue(checkIt);
    }

    @Test
    public void given_1Litre_and1000ML_add_give7point2Litres(){

        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementVolume.LITRE);
        QuantityMeasurement value2 =new QuantityMeasurement(1000,MeasurementVolume.MILLILITER);
        QuantityMeasurement Exp_result =new QuantityMeasurement(2,MeasurementVolume.LITRE);
        double  calculatedValue = value2.addValues(value1);
        System.out.println(calculatedValue);
        QuantityMeasurement result =new QuantityMeasurement(calculatedValue,MeasurementVolume.MILLILITER);
        boolean checkIt=result.compare(Exp_result);
        Assert.assertTrue(checkIt);
    }


    @Test
    public void given_1ton_and1000gram_add_give7point1001kg(){

        QuantityMeasurement value1 =new QuantityMeasurement(1,MeasurementWeight.TONE);
        QuantityMeasurement value2 =new QuantityMeasurement(1000,MeasurementWeight.GRAM);
        QuantityMeasurement Exp_result =new QuantityMeasurement(1001,MeasurementWeight.KG);
        double  calculatedValue = value2.addValues(value1);
        System.out.println(calculatedValue);
        QuantityMeasurement result =new QuantityMeasurement(calculatedValue,MeasurementWeight.GRAM);
        boolean checkIt=result.compare(Exp_result);
        Assert.assertTrue(checkIt);
    }


}
