package kz.zhassulan.algo;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] arr = new int[] {1,4,3,4};
        System.out.println(sumMistake(arr));
    }

    /**
     * Array from 1 to n, but there is one duplicated num and missed num
     * @param arr input array
     * @return sum of missed num and duplicated num
     */
    private static int sumMistake(int[] arr) {
        Set<Integer> distinctNums = new HashSet<>();
        int len = arr.length;
        int duplicate = 0;
        int sumOfArray = 0;
        int sumOfSeq = (len * (len+1)) / 2;
        for (int num : arr) {
            sumOfArray += num;

            if (distinctNums.contains(num)) {
                duplicate = num;
            } else {
                distinctNums.add(num);
            }
        }
        int missedNum = duplicate + (sumOfSeq - sumOfArray);

        return duplicate + missedNum;
    }

}
