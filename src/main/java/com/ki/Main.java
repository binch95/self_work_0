package com.ki;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}}));
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int a = 0;
            for (int z = queries[i][0]; z <= queries[i][1]; z++) {
                if(arr[z] > queries[i][2]){
                    if(arr[z] < ans[i]||ans[i] == 0){                    ans[i] = arr[z];}
                a = 1;
                }
            }
            if ( a == 0){ans[i] = -1;}
        }
        return ans;
    }
}