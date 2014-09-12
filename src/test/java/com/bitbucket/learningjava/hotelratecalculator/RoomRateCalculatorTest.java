package com.bitbucket.learningjava.hotelratecalculator;

/**
 * Created by amit on 9/11/14.
 */

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RoomRateCalculatorTest {

    @Test
    public void shouldReturnCorrectRate(){
        TaxRateByZipCodeService taxRateByZipCodeService = mock(TaxRateByZipCodeService.class);
        when(taxRateByZipCodeService.getTaxPercentForZipCode(anyString())).thenReturn(10.0);
        BaseRateForZipCodeService baseRateForZipCodeService = mock(BaseRateForZipCodeService.class);
        when(baseRateForZipCodeService.getBaseRateForZipCode(anyString())).thenReturn(100.0);
        RoomRateCalculator roomRateCalculator = new RoomRateCalculator(baseRateForZipCodeService,taxRateByZipCodeService);
        assertThat(roomRateCalculator.getTotalRoomRate("97006", 6), closeTo(150.0, 0.01));


    }
}
