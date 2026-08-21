class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // Edge case
        if (s1.length() > s2.length()) {
            return false;
        }

        // Frequency map for s1
        HashMap<Character, Integer> s1Map = new HashMap<>();

        // Frequency map for current window in s2
        HashMap<Character, Integer> windowMap = new HashMap<>();


        // Count frequency of s1
        for (int i = 0; i < s1.length(); i++) {

            char currentChar = s1.charAt(i);

            s1Map.put(
                currentChar,
                s1Map.getOrDefault(currentChar, 0) + 1
            );
        }


        int left = 0;

        // RIGHT scans s2
        for (int right = 0; right < s2.length(); right++) {

            // 1. Add current character to window
            char currentChar = s2.charAt(right);

            windowMap.put(
                currentChar,
                windowMap.getOrDefault(currentChar, 0) + 1
            );


            // 2. Window became bigger than s1?
            if (right - left + 1 > s1.length()) {

                char leftChar = s2.charAt(left);

                // Remove/decrease left character
                windowMap.put(
                    leftChar,
                    windowMap.get(leftChar) - 1
                );

                // If frequency becomes 0, remove it
                if (windowMap.get(leftChar) == 0) {
                    windowMap.remove(leftChar);
                }

                left++;
            }


            // 3. Window size is correct → compare maps
            if (right - left + 1 == s1.length()) {

                if (s1Map.equals(windowMap)) {
                    return true;
                }
            }
        }

        return false;
    }
}