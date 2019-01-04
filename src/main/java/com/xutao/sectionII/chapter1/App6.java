package com.xutao.sectionII.chapter1;

import java.util.Optional;

public class App6 {

    public static final Optional<String> empty = Optional.empty();


    public static void main(String[] args) {
//        App6.orElse();
//        App6.orElseGet();
//        App6.orElseThrow();
        App6.ifPresent();
    }

    public static void orElse(){
        System.out.println("Value is "+empty.orElse("otherValue"));
    }

    public static void orElseGet(){
        System.out.println("value is "+empty.orElseGet(()->"Generate a value"));
    }

    public static void orElseThrow(){
        System.out.println("value is "+empty.orElseThrow(()->new NullPointerException()));
    }

    public static void ifPresent(){
        Optional<Integer> optional = Optional.of(12);
        optional.ifPresent(e-> System.out.println("Exist value is "+e));
    }
}
