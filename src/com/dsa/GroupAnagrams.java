package com.dsa;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to store the sorted string as the key and the list of anagrams as the value
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert the string to a char array, sort it, and then convert it back to a string
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            
            // If the sorted string is already a key in the map, add the original string to the list
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        
        // Return all the values (lists of anagrams) as the result
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
