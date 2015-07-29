package com.bitbucket.learningjava.hotelratecalculator;

import com.google.inject.Inject;

/**
 *
 * Get the room rate for a zip code and the month
 *
 */
public class RoomRateCalculator {

    private  BaseRateForZipCodeService baseRateForZipCodeService;
    private TaxRateByZipCodeService taxRateByZipCodeService;
    private DiscountRateForMonthService discountRateForMonthService;

    @Inject
    //Constructor with services as parameters
    public RoomRateCalculator(BaseRateForZipCodeService zipCodeService, TaxRateByZipCodeService taxRateByZipCodeService, DiscountRateForMonthService discountRateForMonthService) {
        this.baseRateForZipCodeService = zipCodeService;
        this.taxRateByZipCodeService = taxRateByZipCodeService;
        this.discountRateForMonthService = discountRateForMonthService;
    }

    public double getTotalRoomRate( String zipCode, int month) {
        double taxRate = taxRateByZipCodeService.getTaxPercentForZipCode(zipCode);
        double baseRate = baseRateForZipCodeService.getBaseRateForZipCode(zipCode);
        double discountRate = discountRateForMonthService.getDiscountRateForMonth(month);

        return baseRate * (1 +discountRate) + (baseRate * (taxRate/100) ) ;
    }

}