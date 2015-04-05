package com.bitbucket.learningjava.utils;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CharUtilsTest {
    @Test
    public void shouldReturnUpperCase(){
        assertThat(CharUtils.toUpperCase("abcd".toCharArray()), is("ABCD".toCharArray()));
    }
}
