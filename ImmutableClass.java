package com.dev30plus;


import java.util.Date;


public final class ImmutableClass {

    private final int fieldOne;
    private final Integer fieldTwo;
    private final String fieldThree;
    private final Date fieldFour;

    public ImmutableClass(int fieldOne, Integer fieldTwo, String fieldThree, Date fieldFour) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
        this.fieldThree = fieldThree;
        this.fieldFour = (Date) fieldFour.clone();
    }

    public int getFieldOne() {
        return fieldOne;
    }

    public Integer getFieldTwo() {
        return fieldTwo;
    }

    public String getFieldThree() {
        return fieldThree;
    }

    public Date getFieldFour() {
        return fieldFour;
    }
}
