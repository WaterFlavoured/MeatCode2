package meatCodeSolves.hashAndArrays;

import java.util.*;
import java.util.Map.Entry;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(int nword : nums) {
            map.put(nword, map.getOrDefault(nword, 0) + 1);
        }

        for (int key : map.keySet()){
            int freq = map.get(key);
            if (buckets[freq] == null)
                buckets[freq] = new ArrayList<>();
            buckets[freq].add(key);
        }

        int index = 0;
        int[] res = new int[k];
        for (int i = nums.length; i >= 0; i--)
            if (buckets[i] != null)
                for (int val : buckets[i]){
                    res[index++] = val;
                    if(index == k)
                        return res;
                }
        return res;
    }

    public static void main(String[] args) {
        Solution347 sol = new Solution347();
        int[] nums = {4, -1, 2, 1, -1, 2,};
        int k = 2;
        System.out.println(Arrays.toString(sol.topKFrequent(nums, k)));
    }
}
