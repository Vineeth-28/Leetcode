import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Convert word into char array
            char[] chars = word.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Convert back to String → this is our key
            String key = new String(chars);

            // Create list if key doesn't exist
            map.putIfAbsent(key, new ArrayList<>());

            // Add current word to its group
            map.get(key).add(word);
        }

        // Return all groups
        return new ArrayList<>(map.values());
    }
}