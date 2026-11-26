package com.pluralsight.calcengine;

public class Arrays {
    public static void main(String[] args) {
        float[] dec = new float[3];
        dec[0] = 1.0f;
        dec[1] = 2.0f;
        dec[2] = 3.0f;
        float sum = 0.0f;
        for(int index = 0; index<dec.length; index++){
            sum += dec[index];
            //System.out.println(dec[index]);
            System.out.println(sum);

        }
    }
}
