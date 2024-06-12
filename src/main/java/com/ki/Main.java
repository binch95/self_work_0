package com.ki;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3},{1, 2},{1, 4}}));
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int i = 0; i < queries.length; i++) {
            int a = arr[queries[i][0]];
            answer[queries[i][0]] = arr[queries[i][1]];
            answer[queries[i][1]] = a;
        }


        return answer;
    }
}