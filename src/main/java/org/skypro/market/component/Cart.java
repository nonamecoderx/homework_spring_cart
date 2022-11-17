package org.skypro.market.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
     public final List<Integer> userCart= new ArrayList<>();
     public void addToCart(List<Integer> idsToAdd){
         userCart.addAll(idsToAdd);
     }
     public List<Integer>getCart(){
         return userCart ;
     }


}
