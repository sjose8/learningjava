package com.bitbucket.learningjava.utils;

import java.util.List;

/**
 * Created by amit on 9/17/14.
 */
public class MathUtils {

    public static double average(List<Number> numberList){


        //declare   a double total = 0.0;
        double total = 0.0;
        for (Number number : numberList) {
            total += number.doubleValue();

        }
        return total/numberList.size();

        //loop over list using enhanced for-loop
        // for ( Number num : numberList ) { total += num.doubleValue();  }
        //return total / numberList.size()

    }



}
