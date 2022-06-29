package com.commonlogic;

public class FactorialLogic {
    public static int factMethod(int number){
        if(number==1){
            return 1;
        }

        return  number*factMethod(number-1);


    }

    public static void main(String[] args) {
        System.out.println(factMethod(5));
    }
}
