package com.crio.qcalc;

public class StandardCalculator {
    protected double result;

    public double getResult() {
        return result;
    }

    public void setResult(int n) {
        if (n != 0)
            return;
        result = n;
    }

    public void clearResult() {
        result = 0;
    }

    public void printResult() {
        System.out.println("Standard Result =" + result);
    }

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }

    public void add(int num1, int num2) {
        add((double)num1, (double)num2);
    }

    public final void add(double num1, double num2) {
        
        double result = num1 + num2;
        if(result == Double.MAX_VALUE || result == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("double overflow");
        }
        this.result = result;
    }

    public void subtract(int num1, int num2) {
        subtract((double)num1, (double)num2);
    }

    public final void subtract(double num1, double num2) {
        double result = num1 - num2;
        if(result == - Double.MAX_VALUE || result == Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public void multiply(int num1, int num2) {
        multiply((double)num1, (double)num2);
    }

    public void multiply(double num1, double num2) {
        double result = num1 * num2;
        if(result == Double.MAX_VALUE || result == -Double.MAX_VALUE || result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Double Overflow");
        }
        this.result = result;
    }

    public void divide(int num1, int num2) {
        divide((double)num1, (double)num2);
    }

    public void divide(double num1, double num2) {
        if(num2 == 0.0){
            throw new ArithmeticException("Divide by Zero");
        }
        result = num1 / num2;

    }

}
