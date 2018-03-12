package com.spring;//Q3) com.spring.Tea class


import org.springframework.stereotype.Component;

@Component
public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("In tea");
    }
}
