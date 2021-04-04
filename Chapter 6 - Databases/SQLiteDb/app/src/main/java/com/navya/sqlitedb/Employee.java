package com.navya.sqlitedb;

public class Employee {
    private int sno;
    private String name;
    private double increment;

    public Employee(int sno, String name, double increment) {
        this.sno = sno;
        this.name = name;
        this.increment = increment;
    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public double getIncrement() {
        return increment;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }
}
