package com.bitbucket.learningjava.certpractice;

/**
 * Created with IntelliJ IDEA.
 * User: amit
 * Date: 11/2/14
 * Time: 9:11 PM
 * To change this template use File | Settings | File Templates.
 */

public class CertificationPractice {

    public static void main (String... args){
        CertificationPractice certificationPractice = new CertificationPractice();
        certificationPractice.printName(2);
        certificationPractice.printName2("good" , 2);
        System.out.println(certificationPractice.printName3(5 , 4));
        System.out.println(certificationPractice.getName(6));

    }

    public void printName(int x){
        if (x < 1 || x >20){
            throw new IllegalArgumentException("Cannot be less than 1 or more than 20");
        }
        for (int i = 0 ; i < x ; i ++){
            System.out.println("Hello");
        }


    }

    protected void printName2(String message, int numtimes){
        int counter = 0;
        while (counter < numtimes){
            counter ++;
            System.out.println(message);
            counter ++;

        }

    }

    public String printName3(Integer messages, int times){
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (counter <times){
            stringBuilder.append(messages).append(' ');
            counter ++;
        }
        return stringBuilder.toString();
    }

    public static enum Polygon {
        TRIANGLE,QUADRILATERAL, PENTAGON, HEXAGON;
    }


    public Polygon getName(int x){
        Polygon p;
        switch (x){

            case 3 :
                p = Polygon.TRIANGLE;
                break;
            case 4 :
                p = Polygon.QUADRILATERAL;
                break;
            case 5 :
                p = Polygon.PENTAGON;
                break;
            case 6 :
                p = Polygon.HEXAGON;
                break;
            default:
                p = Polygon.HEXAGON;
        }
        return  p;
    }

}
