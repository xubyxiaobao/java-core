package com.xutao.sectionII.chapter1;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App7 {

    public static String words = "Everybody has an idol in their hearts, and most people’s idols are stars from TV shows and movies. While for me, I like to watch all kinds of sports and my favorite player is Li Na. Though she has retired, her spirit inspires me all the time. She is one of the greatest players in Chinese history";

    public static Integer[] ints = new Integer[]{1,3,5,7,9,12,43,13,55,22,56};

    public static void main(String[] args) {
//        App7.forEach();
//        App7.join();
        App7.summary();
    }

    public static void forEach(){
        Stream.of(words.split("\\s+")).forEach(System.out::println);
    }

    public static void toArray(){
        String[] strings = Stream.of(words.split("\\s+")).toArray(String[]::new);
    }

    public static void toCollections(){
        List<String> list = Stream.of(words.split("\\s+")).collect(Collectors.toList());
        Set<String> set = Stream.of(words.split("\\s+")).collect(Collectors.toSet());
    }

    public static void join(){
        String result = Stream.of(words.split("\\s+")).collect(Collectors.joining());
        System.out.println(result);
        result = Stream.of(words.split("\\s+")).collect(Collectors.joining("|"));
        System.out.println(result);
    }

    public static void summary(){
        IntSummaryStatistics summary = Stream.of(ints).collect(Collectors.summarizingInt(e -> e));
        System.out.println("Max Value is "+summary.getMax());
        System.out.println("Min Value is "+summary.getMin());
        System.out.println("Average Value is "+summary.getAverage());
        System.out.println("Count Value is "+summary.getCount());
    }

}
