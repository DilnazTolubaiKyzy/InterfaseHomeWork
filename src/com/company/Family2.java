package com.company;

public class Family2 extends Family{
    private String grandMother;

    public Family2(String mother, String father, String son, String grandMother) {
        super(mother, father, son);
        this.grandMother = grandMother;
    }

    public String getGrandMother() {
        return grandMother;
    }

    public void setGrandMother(String grandMother) {
        this.grandMother = grandMother;
    }

    @Override
    public String toString() {
        return "Family2{" + grandMother + '\'' +
                 getMother() + '\'' +
                 getFather() +'\''+
                getSon() + '\''+
                '}';
    }
}
