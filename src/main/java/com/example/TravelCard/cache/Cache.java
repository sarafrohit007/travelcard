package com.example.TravelCard.cache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 
 * @author: Rohit Saraf
 * Version: 1 Published:- Marh 3, 2019
 * 
 * */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cache {
    String name();
}
