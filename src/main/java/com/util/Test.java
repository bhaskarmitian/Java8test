package com.util;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,9,6,7,0,7,6,3,5,6};

        Map<Integer,Long> map1 =Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map1);
    }
}
