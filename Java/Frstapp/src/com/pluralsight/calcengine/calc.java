package com.pluralsight.calcengine;
public class calc{
    public static void main(String[] args) {
        double val1=100.0d;
        double val2=20.0d;
        double result=0.0d;
        char op = 'd';

        if(op == 'a')
            result = val1+val2;
        else if(op =='s')
            result = val1-val2;
        else if(op =='m')
            result = val1*val2;
        else if(op =='d')
            result = val1/val2;
        else if(op =='m')
            result = val1%val2;
        else
            result = 0.0d;

        System.out.println(result);


    }
}