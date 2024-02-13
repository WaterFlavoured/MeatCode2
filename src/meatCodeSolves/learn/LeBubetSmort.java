package meatCodeSolves.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class LeBubetSmort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 24, 57, 34, 88, 47, 43, 69};
        /*You would then generate buckets encapsulating the range of the numbers aka
        * From 0-100 in intervals of 10
        *
        * Bucket sort is based off of scatter-sort-gather
        *  -Elements are scattered into buckets
        *  -Each bucket is sorted
        *  -Elements are gathered
        *
        * best if algorithm is distributed over several buckets
        *
        * O(n) time complexity (best case where elements are distributed over several buckets)
        * O(n^2) time complexity worst case: all elements are put into one bucket */
        float[] arr2 = { (float)0.897, (float)0.565,
                (float)0.656, (float)0.1234,
                (float)0.665, (float)0.3434 };

        int n = arr2.length;
        bucketSortFloat(arr2, n);

        System.out.println("Sorted array is ");
        for (float el : arr2) {
            System.out.print(el + " ");
        }
        System.out.println(" ");
        // OR (in house sorting)
        List<Integer>[] bucket = new ArrayList[arr.length + 1];

        for(int i = 0; i < arr.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < arr.length; i++) {
            float idx = (float) arr[i] / 10;
            bucket[(int) idx].add(arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            Collections.sort(bucket[i]);
        }

        int index = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < bucket[i].size(); j++) {
                arr[index++] = bucket[i].get(j);
            }
        }

        for(int dick : arr) {
            System.out.print(dick + " ");
        }
    }

    static void bucketSortFloat(float[] arr, int n)
    {
        if (n <= 0)
            return;

        // 1) Create n empty buckets
        @SuppressWarnings("unchecked")
        Vector<Float>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }

        // 2) Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            float idx = arr[i] * n;
            buckets[(int)idx].add(arr[i]);
        }

        // 3) Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // 4) Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }
}
