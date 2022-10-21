package com.company;

public class Hotel implements Housing{
    private Family3 family3;

    public Hotel(Family3 family3) {
        this.family3 = family3;
    }

    @Override
    public void payment() {
        System.out.println("Payment for rent");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "family3=" + family3 +
                '}';
    }
}
