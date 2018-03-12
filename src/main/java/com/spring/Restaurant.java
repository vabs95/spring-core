package com.spring;//Q3) Create class restaurant



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;


@Component    //Q10) use @component
@Controller   //Q10) use @Controller
@Repository   //Q10) use @Repository
public class Restaurant {

// @Autowired           Q8) Autowired with fields
   HotDrink hotDrink;



//   @Autowired                            //Q8) Autowired with constructor
//   public com.spring.Restaurant(com.spring.HotDrink hotDrink) {
//        this.hotDrink = hotDrink;
//    }



        public HotDrink getHotDrink() {
        return hotDrink;
    }


    @Required    //Q8) Use @Required annotation for hotDrink setter method in com.spring.Restaurant class.


    @Autowired   //Q9)Use @Autowired annotation to wire com.spring.Tea with com.spring.Restaurant class Using setter method,
                 // field and constructor.


    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString() {
        return "com.spring.Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }


}
