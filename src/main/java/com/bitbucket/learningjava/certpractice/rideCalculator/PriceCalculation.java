package com.bitbucket.learningjava.certpractice.rideCalculator;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * User: amit
 * Date: 11/3/14
 * Time: 9:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class PriceCalculation {
    private final Double price;
    private final LocalDateTime time;

    public PriceCalculation(Double price, LocalDateTime time) {
        this.price = price;
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
