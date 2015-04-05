package com.bitbucket.learningjava.utils;

/**
 * Created by amit on 9/17/14.
 */
public class CharUtils {
    public static char toUpperCase(char c) {
        return Character.toUpperCase(c);
    }

    public static char toLowerCase(char d) {
        return Character.toLowerCase(d);
    }

    public static char[] toUpperCase(char[] chars) {
        if (chars == null || chars.length == 0) {
            throw new IllegalArgumentException("Invalid Arguments");
        }
        char[] upper = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            upper[i] = toUpperCase(chars[i]);
        }

        return upper;

    }
}
