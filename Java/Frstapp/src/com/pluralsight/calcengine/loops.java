package com.pluralsight.calcengine;
public class loops{
    public static void main(String[] args){
        //factorial
        int somevalue = 3;
        int factorial = 1;
        while(somevalue>1) {
            factorial *= somevalue;
            somevalue--;
        }
        System.out.print(factorial);

    }

}