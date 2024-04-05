package com.ertugrul;

public class _007_ReverseInteger {
    public static void main(String[] args) {

        int  x= 123;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        String xString = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        String reversedStringNumber = stringBuilder.append(xString).reverse().toString();
        if(reversedStringNumber.endsWith("-")){
            try {
                return   (-(Integer.parseInt(reversedStringNumber.replace("-",""))));
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        try {
            Integer.parseInt(reversedStringNumber);
        } catch (NumberFormatException e) {
            return 0;
        }
        return Integer.parseInt(reversedStringNumber) ;
    }
}
