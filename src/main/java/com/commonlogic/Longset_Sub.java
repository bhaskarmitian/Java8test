package com.commonlogic;

import java.util.HashMap;

public class Longset_Sub {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 0, -5, 9, 10, 11, 12, 13, 14, 5, -1};
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for (Integer in : arr) {
            map.put(in, true);
        }
        for (Integer in : arr) {
            if (map.containsKey(in - 1)) {
                map.put(in, false);
            }
        }
        int maxStartPoint = 0;
        int maxLength = 0;
        int maxValue=0;
        for (Integer in : arr) {
            if (map.get(in) == true) {
                int count = 1;
                while (map.containsKey(in + count)) {
                    count++;
                }

                 maxValue=Math.max(count,maxValue);

                /*if(count>maxLength){
                    maxStartPoint=in;
                    maxLength=count;
                }*/
            }
        }
        System.out.println(maxValue);
        /*for(int i=0;i<maxLength;i++){
            System.out.println(maxStartPoint+i);
        }*/
    }
}
