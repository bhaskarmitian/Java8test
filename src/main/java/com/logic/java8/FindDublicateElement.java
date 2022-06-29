package com.logic.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDublicateElement {
    public static void main(String[] args) {
        String arr[]={"Amazon","GCP","Ali Baba","Amazon","Azure","Azure","GCP"};
        System.out.println("************Brute Force******** time complexcity n2");

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                }
            }
        }
        System.out.println("***************HashSet*****************");

        Set<String> data=new HashSet<>();
        for(String s:arr){
            if(data.add(s)==false){
                System.out.println(s);
            }
        }

        System.out.println("***************HashMap*****************");

        HashMap<String,Integer> hashMap=new HashMap<>();
        int count = 0;
        for(String s:arr){
            //System.out.println("********s "+hashMap.get(s)+" string===> "+s);
            if(hashMap.get(s)==null){
                hashMap.put(s,1);
            }else {
                hashMap.put(s,++count);
            }
        }
        System.out.println(hashMap);
        System.out.println("***************Stream*****************");
        Set<String> dubSet=new HashSet<>();
        List<String> list= Arrays.asList(arr).stream().filter(x->!dubSet.add(x)).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("***************Stream Using GroupingBy*****************");

        Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()>1).collect(Collectors.toSet());
    }
}
