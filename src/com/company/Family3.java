package com.company;

public class Family3 extends Family{
    private String grandFather;

    public Family3(String mother, String father, String son, String grandFather) {
        super(mother, father, son);
        this.grandFather = grandFather;
    }

    public String getGrandFather() {
        return grandFather;
    }

    public void setGrandFather(String grandFather) {
        this.grandFather = grandFather;
    }

    @Override
    public String toString() {
        return "Family3{" + grandFather + '\'' +
                 getMother() + '\'' +
                getFather() +'\''+
                 getSon() + '\''+
                '}';
    }
}
