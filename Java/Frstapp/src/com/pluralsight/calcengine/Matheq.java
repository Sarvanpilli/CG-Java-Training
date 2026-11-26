package com.pluralsight.calcengine;

public class Matheq {
    double left;
    double right;
    double result;
    char opcode;

    public Matheq(){

    }
    public Matheq(char opcode){
        this.opcode=opcode;

    }

    public Matheq(char opcode,double left,double right){
        this(opcode);
        this.left = left;
        this.right = right;
    }

    void execute() {
        switch (opcode) {
            case 'a':
                result = left + right;
                break;
            case 's':
                result = left - right;
                break;
            case 'm':
                result = left * right;
                break;
            case 'd':
                result = left / right;
                break;
            default:
                System.out.println("Invalid code");
                break;

        }
    }    
}
