package com.xutao.sectionII.chapter1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * filter、map、flatMap方法
 */
public class App2 {

    public static final URL url = App2.class.getResource("/chapter1.txt");


    public static Stream<String> filter() throws IOException, URISyntaxException {
        String words = "Everybody has an idol in their hearts, and most people’s idols are stars from TV shows and movies. While for me, I like to watch all kinds of sports and my favorite player is Li Na. Though she has retired, her spirit inspires me all the time. She is one of the greatest players in Chinese history";
        Stream<String> stream = Stream.of(words.split("\\s+")).filter(word -> word.length()>7);
        return stream;
    }

    public static Stream<String> map(){
        String words = "Everybody has an idol in their hearts, and most people’s idols are stars from TV shows and movies. While for me, I like to watch all kinds of sports and my favorite player is Li Na. Though she has retired, her spirit inspires me all the time. She is one of the greatest players in Chinese history";
        Stream<String> stream = Stream.of(words.split("\\s+")).map(word -> word.toUpperCase());
        return stream;
    }

    public static Stream<String> flatMap() throws IOException, URISyntaxException {
        Path path = Paths.get(url.toURI());
        List<String> lines = Files.readAllLines(path);
        Stream<String> stream = lines.stream().flatMap(word -> Stream.of(word.split("\\s+")));
        return stream;
    }
}
