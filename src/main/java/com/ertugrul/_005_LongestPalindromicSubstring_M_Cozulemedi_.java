package com.ertugrul;

public class _005_LongestPalindromicSubstring_M_Cozulemedi_ {
    public static void main(String[] args) {
    String string ="babad";
    String string2 ="cbbd";
    String string3 ="a";
        System.out.println(longestPalindrome(string3));
    }
    public static String longestPalindrome(String s) {
        String string="";
        String sonuc ="";
        String reversed="";

        for (int i = 0; i < s.length(); i++) {
            string=String.valueOf(s.charAt(i));

            if(i+1<s.length()){
                for (int j = i+1; j < s.length(); j++) {
                    string+=String.valueOf(s.charAt(j));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    if(stringBuilder.reverse().toString().equals(string)){
                        reversed = stringBuilder.reverse().toString();
                        if(sonuc.length()<reversed.length()){
                            sonuc=string;
                        }
                    }
                }
            }
        }

        if(sonuc.equals("")){
            return string;
        }
        return sonuc;
    }
}
