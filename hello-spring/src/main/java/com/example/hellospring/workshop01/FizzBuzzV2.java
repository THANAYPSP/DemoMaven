package com.example.hellospring.workshop01;

import java.util.List;

public class FizzBuzzV2 {


    public String printFizzBuzzV2(int input) {
        AllCondition[] myConditions = new AllCondition[]{
                new KBTGCond(),
                new FizzBuzzCond(),
                new FizzCond(),
                new BuzzCond()
        };
        for (AllCondition myCondition : myConditions) {
            if(myCondition.Check(input)) {
                return myCondition.Print();
            }
        }
        return String.valueOf(input);
    }
}