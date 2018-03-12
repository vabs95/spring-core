package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");


//Q2) Get the bean of the class from spring container and print the values of the instance variable.

        Database database=applicationContext.getBean("database",Database.class);
        System.out.println("com.spring.Database info:" + database);





        Restaurant restaurant = applicationContext.getBean("teaRestaurant",Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();
        System.out.println("Scope is Prototype? "+ applicationContext.isPrototype("teaRestaurant"));

        Restaurant restaurant2 = applicationContext.getBean("restaurant",Restaurant.class);
        restaurant2.getHotDrink().prepareHotDrink();

        Restaurant restaurant1 = applicationContext.getBean("expressTeaRestaurant",Restaurant.class);
        restaurant1.getHotDrink().prepareHotDrink();


//        @Autowired on Variables
//        com.spring.Restaurant restaurant = applicationContext.getBean("restaurant",com.spring.Restaurant.class);
//        restaurant.getHotDrink().prepareHotDrink();


        Complex complex = applicationContext.getBean("complex",Complex.class);
        System.out.println(complex.getList());
        System.out.println(complex.getSet());
        System.out.println(complex.getMap());
    }
}
