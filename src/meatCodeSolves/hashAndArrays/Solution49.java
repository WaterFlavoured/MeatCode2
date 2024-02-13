package meatCodeSolves.hashAndArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution49 {
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            char[] x = s.toCharArray();

            String d = new String(x);

            if(!map.containsKey(d)) {
                map.put(d, new ArrayList<String>());
            }

            map.get(d).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
