package com.pluralsight.calcengine;

public class calcarr {
    public static void main(String[] args) {
        double[] left = {2.0,3.0,4.5,5.0};
        double[] right = {2.0,3.0,4.5,5.0};
        char[] code = {'a','s','m','d'};
        double[] result = new double[code.length];

        for(int i= 0;i<code.length;i++){
            switch(code[i]){
                case 'a':
                    result[i] = left[i]+right[i];
                    break;
                case 's':
                    result[i] = left[i]-right[i];
                    break;
                case 'm':
                    result[i] = left[i]*right[i];
                    break;
                case 'd':
                    result[i] = left[i]/right[i];
                    break;
                default:
                    System.out.println("Invalid code");
                    break;

            }

        }
        for(double currresult:result)
            System.out.println(currresult);
    }
}
