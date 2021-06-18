package com.example.hellospring.workshop01;

interface AllCondition {
    boolean Check(Integer input);
    String Print();
}

class BuzzCond implements AllCondition {
    @Override
    public boolean Check(Integer input) {
        return input % 5 == 0;
    }

    @Override
    public String Print() {
        return "Buzz";
    }

}
class FizzCond implements AllCondition {
    @Override
    public boolean Check(Integer input) {
        return input % 3 == 0;
    }

    @Override
    public String Print() {
        return "Fizz";
    }
}

class FizzBuzzCond implements AllCondition {
    FizzCond fizzCond = new FizzCond();
    BuzzCond buzzCond = new BuzzCond();

    @Override
    public boolean Check(Integer input) {
        if(fizzCond.Check(input) && buzzCond.Check(input)) {
            return true;
        }
        return false;
    }

    @Override
    public String Print() {
        return "FizzBuzz";
    }
}

class KBTGCond implements AllCondition {

    @Override
    public boolean Check(Integer input) {
        return input%7==0;
    }

    @Override
    public String Print() {
        return "KBTG Java Basic";
    }
}
