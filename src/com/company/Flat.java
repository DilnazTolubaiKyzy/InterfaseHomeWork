package com.company;

public class Flat implements Housing{
    private Family1 family1;

    public Flat(Family1 family1) {
        this.family1 = family1;
    }

    @Override
    public void payment() {
        System.out.println("Payment for the service");
    }

    @Override
    public String toString() {
        return "Flat{" +
                "family1=" + family1 +
                '}';
    }
}
