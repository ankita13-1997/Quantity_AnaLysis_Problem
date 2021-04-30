package com.Ankita.QuantityMeasuremnet;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementAddition {

    @Test
    public void given_ValuesInInches_AddToGiveValuesInInch(){

        QuantityMeasurement value1 =new QuantityMeasurement(2.0,MeasurementLength.INCH);
        QuantityMeasurement value2 =new QuantityMeasurement(2.0,MeasurementLength.INCH);
        QuantityMeasurement Exp_result =new QuantityMeasurement(4.0,MeasurementLength.INCH);
        double  calculatedValue = value1.addValues(value2);
        QuantityMeasurement result =new QuantityMeasurement(calculatedValue,MeasurementLength.CM);
        boolean checkIt=result.compare(Exp_result);
        Assert.assertTrue(checkIt);



    }
    @Test
    public void given_ValuesInFeetAndInches_AddToGiveValuesInInch(){
        QuantityMeasurement value1 =new QuantityMeasurement(1.0,MeasurementLength.FEET);
        QuantityMeasurement value2 =new QuantityMeasurement(2.0,MeasurementLength.INCH);
        QuantityMeasurement Exp_result =new QuantityMeasurement(14.0,MeasurementLength.INCH);
        double  calculatedValue = value1.addValues(value2);
        QuantityMeasurement result =new QuantityMeasurement(calculatedValue,MeasurementLength.CM);
        boolean checkIt=result.compare(Exp_result);
        Assert.assertTrue(checkIt);

    }

    @Test
    public void given_ValuesInFeet_AddToGiveValuesInInch(){

        QuantityMeasurement value1 =new QuantityMeasurement(1.0,MeasurementLength.FEET);
        QuantityMeasurement value2 =new QuantityMeasurement(1.0,MeasurementLength.FEET);
        QuantityMeasurement Exp_result =new QuantityMeasurement(24.0,MeasurementLength.INCH);
        double  calculatedValue = value1.addValues(value2);
        QuantityMeasurement result =new QuantityMeasurement(calculatedValue,MeasurementLength.CM);
        boolean checkIt=result.compare(Exp_result);
        Assert.assertTrue(checkIt);
    }

    @Test
    public void given_ValuesInInchAndCM_AddToGiveValuesInInch(){

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
    public void given_ValuesInGallonAndLitres_AddToGiveValuesInLitres(){

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
    public void given_ValuesInLitresAndMillilitres_AddToGiveValuesInLitres(){

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
    public void given_ValuesInTonAndGrams_AddToGiveValuesInKg(){

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
