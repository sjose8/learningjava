package com.bitbucket.learningjava;

import org.assertj.core.data.Offset;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;


/**
 * Created by amit on 9/11/14.
 */
public class WeightConvertorTest {

    @Test
    public void shouldConvertPoundsToKilograms(){
        WeightConvertor weightConvertor = new WeightConvertor();
        assertThat(weightConvertor.poundsToKilograms(10.0)).isCloseTo(4.535, Offset.offset(0.001));


    }
}
