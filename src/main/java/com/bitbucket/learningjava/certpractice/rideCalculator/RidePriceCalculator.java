package com.bitbucket.learningjava.certpractice.rideCalculator;

import java.time.DayOfWeek;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: amit
 * Date: 11/3/14
 * Time: 9:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class RidePriceCalculator {

    public static enum Rides {
        RIDEONE, RIDETWO, RIDETHREE;
    }

    public PriceCalculation calculatePrice(List<Double> ages, Rides rides, DayOfWeek dayOfWeek, Boolean offSeason) {


        return null;
    }

    public double calculateBasePrice(double ages, double price){

        return  ages * price;
    }
}
