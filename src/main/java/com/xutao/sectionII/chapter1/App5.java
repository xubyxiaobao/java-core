package com.xutao.sectionII.chapter1;

import java.util.Optional;
import java.util.stream.Stream;

public class App5 {
    public static final String words = "The famous players in China such as Yao Ming and Liu Xiang, who have been mentioned all the time, even though they are no longer fighting in the course";
    public static void main(String[] args) {
//        App5.max();
//        App5.findFirst();
//        App5.findAny();
//        App5.anyMatch();
//        App5.allMatch();
        App5.noneMatch();
    }

    public static void max(){
        Integer[] ints = new Integer[]{1,2,3,4,5,6,7,8,9,0,9,7,6,54,3,2,1};
        Optional<Integer> max = Stream.of(ints).max(Integer::compare);
        System.out.println("max value :"+max.orElse(-1));
    }

    public static void findFirst(){
        Optional<String> first = Stream.of(words.split("\\s+")).map(String::toUpperCase).filter(e->e.startsWith("T")).findFirst();
        System.out.println("max value :"+first.orElse("NoExist"));
    }

    public static void findAny(){
        Optional<String> first = Stream.of(words.split("\\s+")).map(String::toUpperCase).filter(e->e.startsWith("S")).findAny();
        System.out.println("exist value :"+first.orElse("NoExist"));
    }

    public static void anyMatch(){
        boolean flag = Stream.of(words.split("\\s+")).map(String::toUpperCase).anyMatch(e -> e.startsWith("P"));
        System.out.println("exist value :"+flag);
    }

    public static void allMatch(){
        boolean flag = Stream.of(words.split("\\s+")).map(String::toUpperCase).allMatch(e -> e.length()>3);
        System.out.println("allMath :"+flag);
    }

    public static void noneMatch(){
        boolean flag = Stream.of(words.split("\\s+")).map(String::toUpperCase).noneMatch(e -> e.length()>10);
        System.out.println("noneMatch :"+flag);
    }
}
