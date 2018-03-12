package com.spring;//Q3) Expresstea class

import org.springframework.stereotype.Component;

//@Component is commented because it will cause ambigutity as Tea also uses @Component


public class ExpressTea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("In expresstea");
    }
}
