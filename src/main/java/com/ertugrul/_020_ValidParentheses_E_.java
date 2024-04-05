package com.ertugrul;

import java.util.Stack;

public class _020_ValidParentheses {
    public static void main(String[] args) {

        String string1 = "()";
        String string2 = "()[]{}";
        String string4 = ")[]{}";
        String string3 = "(]";

        System.out.println(isValid(string4));
    }
    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        String firstCheck="}])";
        for (int i = 0; i < s.length(); i++) {

            if(!(characterStack.isEmpty())){
                Character peeked = characterStack.peek();
                if(String.valueOf(peeked).equals("(") && String.valueOf(s.charAt(i)).equals(")")){
                    characterStack.pop();
                } else if (String.valueOf(peeked).equals("{") && String.valueOf(s.charAt(i)).equals("}")) {
                    characterStack.pop();
                } else if (String.valueOf(peeked).equals("[") && String.valueOf(s.charAt(i)).equals("]")) {
                    characterStack.pop();
                } else {
                    characterStack.add(s.charAt(i));
                }
            } else {
                if(firstCheck.contains(String.valueOf(s.charAt(i)))){
                    return false;
                }
                characterStack.add(s.charAt(i));
            }


        }
        return characterStack.isEmpty();
    }
}
