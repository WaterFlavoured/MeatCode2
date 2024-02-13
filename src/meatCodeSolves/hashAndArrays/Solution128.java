package meatCodeSolves.hashAndArrays;

import java.util.Arrays;
import java.util.HashMap;

public class Solution128 {
    public static void main(String[] args) {
        Solution128 sol = new Solution128();

        int[] x = {0, 0, -1};

        System.out.println(sol.longestConsecutive(x));
    }

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] x = new int[10000];
        x = nums;
        int k = 0;
        for(int i = 1; i < nums.length; i++) {
            k++;
            if(nums[i] == nums[i-1]) {
                k--;
                continue;
            }
            if(nums[i] != nums[i-1]+1) {
                map.put(k, map.getOrDefault(k, 0) + 1);
                k=0;
            }
        }
        k++;

        map.put(k, map.getOrDefault(k, 0) + 1);

        int[] sol = new int[map.size()];
        int index = 0;
        for(int d : map.keySet()) {
            sol[index] = d;
            index++;
        }

        Arrays.sort(sol);

        return sol[sol.length-1];
    }
}
