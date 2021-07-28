package com.company.algoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public  static List<int[]> threeNumberSum(int[] array, int targetSum){
        Arrays.sort(array);
        var triplet = new ArrayList();

        for (int i = 0; i < array.length - 2; i++) {
            int left = 0;
            int right = array.length - 1;

            int curentSum = array[i] + array[left] + array[right];

            while(left < right){
                if (curentSum > targetSum) right--;
                else if(curentSum < targetSum) left++;
                else{
                    triplet.add(new int[] { array[i], array[left], array[right]});
                }
            }
        }
        return triplet;
    }
}
