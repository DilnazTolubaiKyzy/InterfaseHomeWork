package com.company;

public abstract class Family {
    private String mother;
    private String father;
    private String son;

    public Family(String mother, String father, String son) {
        this.mother = mother;
        this.father = father;
        this.son = son;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }
}
