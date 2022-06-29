package com.logic.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("A","B","C","D","A","B");
        Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);
    }
}
