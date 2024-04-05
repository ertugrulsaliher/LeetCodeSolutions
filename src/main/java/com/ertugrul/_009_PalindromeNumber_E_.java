package com.ertugrul;

public class _009_PalindromeNumber_E_ {
    public static void main(String[] args) {
    int x= 357;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xString).reverse();
        return xString.contentEquals(stringBuilder);
    }
}
