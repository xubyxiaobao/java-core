package com.xutao.sectionII.chapter1;

import java.util.stream.Stream;

public class App3 {

    public static final String words1 = "The famous players in China such as Yao Ming and Liu Xiang, who have been mentioned all the time, even though they are no longer fighting in the course";
    public static final String words2 = "Since she retired, she became a mother and recently her second baby was born";

    public static Stream<String> subStream1(){
        Stream<String> stream = Stream.of(words1.split("\\s+")).limit(5);
        return stream;
    }

    public static Stream<String> subStream2(){
        Stream<String> stream = Stream.of(words1.split("\\s+")).skip(15);
        return stream;
    }


    public static Stream<String> join(){
        Stream<String> stream1 = Stream.of(words1.split("\\s+")).limit(5);
        Stream<String> stream2 = Stream.of(words2.split("\\s+")).limit(5);
        Stream<String> stream = Stream.concat(stream1, stream2);
        return stream;
    }
}
