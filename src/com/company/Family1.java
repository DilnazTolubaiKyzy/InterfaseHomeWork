package com.company;

public class Family1 extends Family{
    private String daughter;

    public Family1(String mother, String father, String son, String daughter) {
        super(mother, father, son);
        this.daughter = daughter;
    }

    public String getDaughter() {
        return daughter;
    }

    public void setDaughter(String daughter) {
        this.daughter = daughter;
    }

    @Override
    public String toString() {
        return "Family1{" + daughter + '\'' +
               getMother() + '\'' +
                 getFather() +'\''+
                 getSon() + '\''+
                '}';
    }
}
