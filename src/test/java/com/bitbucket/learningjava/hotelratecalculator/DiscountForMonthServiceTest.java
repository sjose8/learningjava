package com.bitbucket.learningjava.hotelratecalculator;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by sjose7 on 7/28/15.
 */
@RunWith(DataProviderRunner.class)
public class DiscountForMonthServiceTest {

    @Test
    @UseDataProvider("dataProviderMonth")
    public void ShouldReturnExpectedDiscountRate(int month, double expectedRate){
        DiscountRateForMonthService classUnderTest = new DiscountRateForMonthService();//toDouble?
        assertThat(classUnderTest.getDiscountRateForMonth(month)).isEqualTo(expectedRate);
    }

    @DataProvider
    public static Object[][] dataProviderMonth() {
        // @formatter:off
        return new Object[][] {
                { 1, -0.3 },
                { 2, -0.3 },
                { 3, 0.3 },
                { 4, 0.0 },
                { 5, 0.0 },
                { 6, 0.4 },
                { 7, 0.4},
                { 8, 0.4 },
                { 9, 0.0 },
                { 10, -0.3 },
                { 11, 0.2 },
                { 12, 0.2},
                /* ... */
        };
        // @formatter:on
    }
}