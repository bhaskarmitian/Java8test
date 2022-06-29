package com.design.pattern.factory;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("preparing....");
    }

    @Override
    public void bake() {
        System.out.println("baking....");
    }

    @Override
    public void cut() {
        System.out.println("Finished");
    }
}
