package com.commonlogic;

class StringReverse {
    public static void main (String[] args) {

        String str= "Geeks", nstr="";

        for (int i=0; i<str.length(); i++)
        {
            nstr= str.charAt(i)+nstr; //extracts each character
            //nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}

//Contributed by Tiyasa
