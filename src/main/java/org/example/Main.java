package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        sum(5,5);
        minus(5,4);
        multiply(5,5);
        try {
            multiply(0,5);
            def(5,5);
        }catch (ArithmeticException e){
           e.printStackTrace();
        }
    }
    public static void sum(int firstNumber, int secondNumber){
        System.out.println(firstNumber + secondNumber);

    }
    public static void multiply(double firstNumber, double secondNumner) throws RuntimeException{
        if (firstNumber == 0 || secondNumner == 0){
            throw new ArithmeticException("Exceprion: на 0 делить нельзя");
        }else {
            System.out.println(firstNumber * secondNumner);
        }

    }
    public static void minus(int firstNumber, int secondNumber) throws RuntimeException{
        System.out.println(firstNumber-secondNumber);

    }
    public static void def(int first, int sec) throws RuntimeException{
        if (first == 0 || sec ==0){
            throw new ArithmeticException("На 0 нельза")
        }else {
            System.out.println(first/sec);
        }

    }
}