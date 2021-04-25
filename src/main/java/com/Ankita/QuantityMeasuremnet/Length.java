package com.Ankita.QuantityMeasuremnet;

import java.util.Objects;

 class Length {


     private final double value;
     private final Unit unit;
     private static final double FEET_TO_INCH = 12;



     public enum Unit{
        FEET,
        INCH;
    }
    public Length(Unit unit,double value) {
        this.unit=unit;
        this.value =value;
    }

     public boolean compareTo(Length that) {
         if (this.unit.equals(that.unit))
             return this.unit.equals(that.unit);
         if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
             return Double.compare(this.value*FEET_TO_INCH,that.value)==0;

         return false;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
