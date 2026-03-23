package com.advanced.dsa.algos.backtracking;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        backtracking(arr,result,new ArrayList<>(),used);
        System.out.println(result);
    }
    static void backtracking(int[] nums, List<List<Integer>> result,List<Integer> temp,boolean[] used){
        if (temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (used[i]) continue;
            temp.add(nums[i]);
            used[i]=true;
            backtracking(nums, result, temp, used);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }

}
