package com.company;

public class Dormitory implements Housing{
    private Family2 family2;

    public Dormitory(Family2 family2) {
        this.family2 = family2;
    }

    @Override
    public void payment() {
        System.out.println("Payment for rent");
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "family2=" + family2 +
                '}';
    }
}
