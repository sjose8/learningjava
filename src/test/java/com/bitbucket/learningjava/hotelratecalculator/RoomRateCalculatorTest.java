package com.bitbucket.learningjava.hotelratecalculator;

/**
 * Created by amit on 9/11/14.
 */

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.number.IsCloseTo.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(DataProviderRunner.class)
public class RoomRateCalculatorTest {

    @Test
    public void shouldReturnCorrectRate(){
        TaxRateByZipCodeService taxRateByZipCodeService = mock(TaxRateByZipCodeService.class);
        when(taxRateByZipCodeService.getTaxPercentForZipCode(anyString())).thenReturn(10.0);
        BaseRateForZipCodeService baseRateForZipCodeService = mock(BaseRateForZipCodeService.class);
        when(baseRateForZipCodeService.getBaseRateForZipCode(anyString())).thenReturn(100.0);
        //mocking discountRate
        DiscountRateForMonthService discountRateForMonthService = mock(DiscountRateForMonthService.class);
        when(discountRateForMonthService.getDiscountRateForMonth(anyInt())).thenReturn(-0.3);

        //mock month= 1 => expected rate = 80
        RoomRateCalculator roomRateCalculator = new RoomRateCalculator(baseRateForZipCodeService,taxRateByZipCodeService, discountRateForMonthService);
        assertThat(roomRateCalculator.getTotalRoomRate("97006", 1), closeTo(80, 0.01));
    }
}