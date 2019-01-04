package com.xutao.sectionII.chapter1;

import java.util.Comparator;
import java.util.stream.Stream;

public class App4 {

    public static void main(String[] args) {
//        App4.distinct().forEach(System.out::println);
//        App4.sorted().forEach(System.out::println);
        App4.peek();
    }

    public static Stream<Integer> distinct(){
        Integer[] ints = new Integer[]{1,2,3,4,5,6,7,8,9,0,9,7,6,54,3,2,1};
        Stream<Integer> stream = Stream.of(ints).distinct();
        return stream;
    }

    public static Stream<String> sorted(){
        String words = "The famous players in China such as Yao Ming and Liu Xiang, who have been mentioned all the time, even though they are no longer fighting in the course";
        Stream<String> stream = Stream.of(words.split("\\s+")).sorted(Comparator.comparing(String::length));
        return stream;
    }

    public static void peek(){
        String words = "The famous players in China such as Yao Ming and Liu Xiang, who have been mentioned all the time, even though they are no longer fighting in the course";
        Stream<String> stream = Stream.of(words.split("\\s+")).peek(e-> System.out.println("peek element:"+e)).limit(5);
        stream.forEach(System.out::println);
    }
}
