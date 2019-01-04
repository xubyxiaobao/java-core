package com.xutao.sectionII.chapter1;

import java.math.BigInteger;
import java.util.Random;
import java.util.stream.Stream;

/**
 * 流的创建
 */
public class App1 {

    /**
     * 由数组创建流
     */
    public static Stream<Integer> generator1(){
        Integer[] ints = new Integer[]{1,3,4,5,6,7,8,9,10};
        Stream<Integer> stream = Stream.of(ints);
        return stream;
    }

    /**
     *  创建不包含任何元素的流
     */
    public static Stream<Integer> generator2(){
        Stream<Integer> stream = Stream.empty();
        return stream;
    }

    /**
     *  创建无限流 generate
     */
    public static Stream<Integer> generator3(){
        Random random = new Random();
        Stream<Integer> stream = Stream.generate(()->random.nextInt()).limit(30);
        return stream;
    }

    /**
     * 创建无限流 iterate
     * 根据一个seed 和一个function产生无限流
     */
    public static Stream<BigInteger> generator4(){
        Stream<BigInteger> stream = Stream.iterate(BigInteger.ONE, last -> last.add(BigInteger.TEN));
        return stream;
    }
}
