package meatCodeSolves.hashAndArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution238 {
    public static void main(String[] args) {
        Solution238 sol = new Solution238();

        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(sol.productExceptSelf(a)));
    }
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int l = 1, r = 1;

        for(int i = 0; i < nums.length; i++) {
            ans[i] = l;
            l *= nums[i];
        } // runs left array first
        for(int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= r;
            r *= nums[i];
        } // runs right array of the index
        return ans;
    }
}
