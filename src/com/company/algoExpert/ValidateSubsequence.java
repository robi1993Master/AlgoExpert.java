package com.company.algoExpert;

import java.util.List;

public class ValidateSubsequence {

    public static boolean validateSubsequence(List<Integer> array, List<Integer> sequence){
        int arrIdx = 0;
        int seqInx = 0;

        while(arrIdx < array.size() && seqInx < sequence.size()){
            if (array.get(arrIdx).equals(sequence.get(seqInx))) {
                seqInx++;
            }
            arrIdx++;
        }
        return seqInx == sequence.size();

    }
    public static boolean validateSubsequence1(List<Integer> array, List<Integer> sequence){
        int seqIdx = 0;
        for (var value : array){
            if (seqIdx == sequence.size()) {
                break;
            }
            if (sequence.get(seqIdx).equals(value)) {
                seqIdx++;
            }
        }
        return seqIdx == sequence.size();
    }
}
