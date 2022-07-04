package com.theorem;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {
    public static void main(String[] args) {
        //Map<String,Integer> map=new HashMap<>();
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> val = it.next();

            map.put("e", 5);
        }
        // System.out.println(map);


        //List<String> arr = new ArrayList<>();
        List<String> arr = new CopyOnWriteArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        Iterator<String> itList = arr.iterator();
        while (itList.hasNext()) {
            if (itList.next()=="A") {
                arr.remove(0);
            }

        }
        System.out.println(arr);

    }
}
