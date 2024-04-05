package com.ertugrul;

import java.util.HashSet;
import java.util.Set;

public class _287_FindTheDublicateNumber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!(integerSet.add(nums[i]))){
                return nums[i];
            }
        }
        return 0;
    }
}
