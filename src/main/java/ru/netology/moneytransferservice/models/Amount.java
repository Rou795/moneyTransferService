package ru.netology.moneytransferservice.models;

public class Amount {
    private int value;
    private Currencies currency;

    public Amount(int value, Currencies currency) {
        this.value = value;
        this.currency = currency;
    }

    public Currencies getCurrency() {
        return currency;
    }

    public int getValue() {
        return value;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
