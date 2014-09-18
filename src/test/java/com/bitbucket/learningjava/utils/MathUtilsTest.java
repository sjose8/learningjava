package com.bitbucket.learningjava.utils;

import org.hamcrest.number.IsCloseTo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;

/**
 * Created by amit on 9/17/14.
 */
public class MathUtilsTest {
    @Test
    public void shouldReturnCorrectAverage(){
        List<Number> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);
        assertThat(MathUtils.average(numbers), IsCloseTo.closeTo(6.0, 0.001));

    }
}
