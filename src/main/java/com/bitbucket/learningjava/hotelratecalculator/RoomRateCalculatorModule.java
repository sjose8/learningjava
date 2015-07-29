package com.bitbucket.learningjava.hotelratecalculator;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import java.util.Currency;

/**
 * Created by sjose7 on 7/29/15.
 */
public class RoomRateCalculatorModule extends AbstractModule {

    public static final String USD = "USD";

    @Override
    protected void configure() {
        bind(java.util.Currency.class).annotatedWith(Names.named(USD)).toInstance(Currency.getInstance(USD));
    }
////    private final String currency;
//
//    protected void configure(){
//        bindConstant().annotatedWith(BaseRateForZipCodeService.Currency.getClass().to(currency));
//    }
//

}