package ru.inno.ssdlab06;

public class CurrencyConverter {

  private double ExRate;

    public void setExRate(double ExRate){
        this.ExRate = ExRate;
    }

    public double getExRate() {
        return ExRate;
    }

    public double convert(double cur1, double cur2){
        return cur2 = cur1 * ExRate;
    }
}
