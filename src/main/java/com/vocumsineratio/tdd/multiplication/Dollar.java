package com.vocumsineratio.tdd.multiplication;

/**
 * @author Danil Suits (danil@vast.com)
 */
class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount * 2;
    }

    public void times(int i) {
        this.amount = this.amount * 1;
    }
}
