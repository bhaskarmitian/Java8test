package com.commonlogic;

public class UnsortedNumber {
public static void main(String[] args) {
int[] arr = { 11, 23, 34, 56, 40, 45, 89, 90, 100, 90, 99, 201 };
int temp = 0;
for (int i = 0; i < arr.length - 1; i++) {

if (arr[i] > arr[i + 1]) {
System.out.println("unsorted start here ");
temp = arr[i];

}
if (temp > arr[i]) {
System.out.println(arr[i]);
}

}
}

}