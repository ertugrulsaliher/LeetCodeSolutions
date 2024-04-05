package com.ertugrul;

import java.util.HashMap;

public class _013_RomanToInteger_E_ {
    public static void main(String[] args) {
    String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        HashMap<String,Integer> romanAndNumeric = new HashMap<>();
        romanAndNumeric.put("I",1);
        romanAndNumeric.put("V",5);
        romanAndNumeric.put("X",10);
        romanAndNumeric.put("L",50);
        romanAndNumeric.put("C",100);
        romanAndNumeric.put("D",500);
        romanAndNumeric.put("M",1000);

        int result = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(i!=0){
                if(romanAndNumeric.get(String.valueOf(s.charAt(i)))<=romanAndNumeric.get(String.valueOf(s.charAt(i-1)))){
                    result +=romanAndNumeric.get(String.valueOf(s.charAt(i)));
                } else{
                    result+=(romanAndNumeric.get(String.valueOf(s.charAt(i)))-romanAndNumeric.get(String.valueOf(s.charAt(i-1))));
                    i--;
                }
            } else {
                result +=romanAndNumeric.get(String.valueOf(s.charAt(i)));
            }

        }

        return result;

    }
}
