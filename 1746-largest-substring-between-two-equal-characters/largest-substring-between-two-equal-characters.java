public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int result = -1;
        int n = s.length();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    result = Math.max(result, j - i - 1);
                }
            }
        }

        return result;
    }
}