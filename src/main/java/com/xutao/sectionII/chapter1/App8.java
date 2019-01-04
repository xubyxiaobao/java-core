package com.xutao.sectionII.chapter1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App8 {

    private static Person[] persons = new Person[]{new Person("A",1),new Person("B",2),
            new Person("C",3),new Person("D",4),new Person("E",5),new Person("F",6)};

    public static void main(String[] args) {
//        App8.toMap();
        App8.toMapRepeat();
    }

    public static void toMap(){
        Map<String, Integer> map = Stream.of(persons).collect(Collectors.toMap(Person::getName,Person::getAge));
        System.out.println(map);
    }

    public static void toMapRepeat(){
        Person[] persons = new Person[]{new Person("A",1),new Person("B",2),
                new Person("C",3),new Person("D",4),new Person("E",5),new Person("A",6)};
        Map<String, Integer> map = Stream.of(persons).collect(Collectors.toMap(Person::getName,Person::getAge,(oldVallue,newValue)-> oldVallue>newValue?oldVallue:newValue));
        System.out.println(map);
    }

    public static void toMapConstruct(){
        Stream<Locale> stream = Stream.of(Locale.getAvailableLocales());
        stream.collect(Collectors.toMap(Locale::getDisplayCountry,l-> Collections.singleton(l.getDisplayLanguage()),(a,b)->{
            Set<String> union = new HashSet<>(a);
            union.addAll(b);
            return union;
        },TreeMap::new));
    }

}


class Person{
    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
