package com.ertugrul;

public class _014_LongestCommonPrefix_E_ {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};
        String[] strs3 = {"aa","ab"};
        String[] strs4 = {"aacbb","abb"};
        System.out.println(longestCommonPrefix(strs4));
    }
    public static String longestCommonPrefix(String[] strs) {
        String firstWord = strs[0];
        String result="";
        boolean isCommon=true;
        String starstWith="";
        for (int i = 0; i < firstWord.length(); i++) {
            starstWith+=String.valueOf(firstWord.charAt(i));
            for (int j = 1; j < strs.length; j++) {
               if(strs[j].startsWith(starstWith)){

               }else {
                   isCommon = false;
                   break;
               }
            }
            if(isCommon){
                result = starstWith;
            }
        }
        return result;
    }
}
