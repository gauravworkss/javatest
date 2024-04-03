package com.mav.prac;

class Parent {
    int value = 1000;
    public Parent() {
        System.out.println("Parent Constructor");
    }
    public void m1() {
        System.out.println("Parent method");
    }
}
class Child extends Parent {
    int value = 1000;
    public Child() {
        System.out.println("Child Constructor");
    }
    public void m1() {
        System.out.println("Child method");
    }
}
public class Main {
    public static void main(String[] args) {
        Parent p1= new Child();
        p1.m1();
    }

}
