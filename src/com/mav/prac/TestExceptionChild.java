package com.mav.prac;

class Parent1 {
    void msg0(){
        System.out.println("parent method");
    }
}
public class TestExceptionChild extends Parent1 {
    void msg0() throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String[] args) {
        Parent1 p = new TestExceptionChild();
        p.msg0();
    }
}
