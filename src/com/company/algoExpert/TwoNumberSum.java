package com.company.algoExpert;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            int left = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int right = array[j];
                if (left + right == targetSum) {
                    return new int[]{left, right};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSum2(int[] array, int targetSum) {
        Set<Integer> numbers = new HashSet<Integer>();

        for (int num : array) {
            int potentialMatch = targetSum - num;
            if (numbers.contains(potentialMatch)) {
                return new int[]{potentialMatch, num};
            } else {
                numbers.add(num);
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSum3(int[] array, int targetSum){
        Arrays.sort(array);

        int left = 0;
        int right = array.length -1;
        while (left < right) {
            int currentSum = array[left] + array [right];
            if (currentSum == targetSum) {
                return new int[] {array[left], array[right]};
            }else if (currentSum < targetSum) {
                left++;
            }else if (currentSum > targetSum) {
                right --;
            }
        }
        return  new int[0];
    }
}
