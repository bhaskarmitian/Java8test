package com.design.pattern.factory;

public class PizzaStore {
    public Pizza  orderPizza(String type){
        Pizza pizza;
        if(type.equalsIgnoreCase("cheesePizza")){
            pizza=new CheesePizza();
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            return pizza;
        }
        return null;
    }
}
