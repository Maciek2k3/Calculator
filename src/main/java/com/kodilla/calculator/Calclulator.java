package com.kodilla.calculator;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
        public int minus (int a,int b){
        return a-b;
    }




    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.add(5,6));
        System.out.println(calc.minus(6,7));
    }
}