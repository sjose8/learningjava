package com.bitbucket.learningjava.hotelratecalculator;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.io.Console;
import java.util.Currency;
import java.util.Scanner;

/**
 * MAin class for running the program. http://docs.oracle.com/javase/tutorial/essential/io/cl.html
 */

public class Main {
    public static void main(String... args) {
        String zipCode;
        int month;
        Scanner in = new Scanner(System.in);

        do {
            // and stores into zipcode variable
            System.out.println("Enter a valid ZipCode ( Enter q to quit ):");
             zipCode = in.next();
            if( zipCode != null && zipCode.equalsIgnoreCase("q")) {
                System.exit( 0 );
            }

            // Reads a integer from the console
            System.out.println("Enter a valid month number[1-12]:");
            month = in.nextInt();
            if( zipCode == null || month <= 0) {
                System.out.print("Calculation failed : Valid Zipcode and Month are required !!! ");
                System.exit( 1 );
            }
            //Injection stuff
            Injector injector = Guice.createInjector( new RoomRateCalculatorModule());
            RoomRateCalculator roomRateCalculator = injector.getInstance(RoomRateCalculator.class);

//            RoomRateCalculator roomRateCalculator = new RoomRateCalculator(
//                    new BaseRateForZipCodeService(Currency.getInstance("USD")),
//                    new TaxRateByZipCodeService(),
//                    new DiscountRateForMonthService());
            System.out.println( String.format("The total room rate for %s and month %d is %f" ,
                    zipCode,month,roomRateCalculator.getTotalRoomRate(zipCode,month)) );

        } while (true);
    }
}
