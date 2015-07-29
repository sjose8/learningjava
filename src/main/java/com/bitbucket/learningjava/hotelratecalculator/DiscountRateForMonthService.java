package com.bitbucket.learningjava.hotelratecalculator;

import com.google.inject.Singleton;

/**
 * Created by sjose7 on 7/28/15.
 */
@Singleton
public class DiscountRateForMonthService {
    public DiscountRateForMonthService(){
        //constructor
    }
    public double getDiscountRateForMonth( int month) {
        if( month <=8 && month >=6 ) {
            return 0.4;
        }
        else if ( month == 12 || month == 11  ) {
            return 0.2;
        }
        else if ( month == 3 ) {
            return 0.3;
        }
        else if ( month == 10 || month == 2 || month == 1  ) {
            return -0.3;
        }
        else {
            return 0.0;
        }
    }
}
