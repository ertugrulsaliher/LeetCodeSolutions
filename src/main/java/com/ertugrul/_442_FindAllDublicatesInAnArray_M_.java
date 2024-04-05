package com.ertugrul;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _442_FindAllDublicatesInAnArray_E_ {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!(integerSet.add(nums[i]))){
                resultList.add(nums[i]);
            }
        }

        return resultList;


    }

}
