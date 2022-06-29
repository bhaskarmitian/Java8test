package com.design.pattern.factory;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore ps=new PizzaStore();
        ps.orderPizza("cheesePizza");
    }
}
