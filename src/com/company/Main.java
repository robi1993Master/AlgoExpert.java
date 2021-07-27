package com.company;

import com.company.algoExpert.TwoNumberSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayy = {1,5,6,2,4,8,9,64,1};
    //    int[] rezultat = TwoNumberSum.twoNumberSum(arrayy,25);
    //   int[] rez = TwoNumberSum.twoNumberSum2(arrayy,21);
    //   System.out.println(Arrays.toString(rez));
        int[] rez1 = TwoNumberSum.twoNumberSum3(arrayy, 10);
        System.out.println(Arrays.toString(rez1));
    }
}
