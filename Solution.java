import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (areSimilar(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean areSimilar(String word1, String word2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        
        for (char c : word1.toCharArray()) {
            set1.add(c);
        }
        for (char c : word2.toCharArray()) {
            set2.add(c);
        }
        
        return set1.equals(set2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String[] words1 = {"aba", "aabb", "abcd", "bac", "aabc"};
        System.out.println(solution.similarPairs(words1)); // Expected: 2

        String[] words2 = {"aabb", "ab", "ba"};
        System.out.println(solution.similarPairs(words2)); // Expected: 3

        String[] words3 = {"nba", "cba", "dba"};
        System.out.println(solution.similarPairs(words3)); // Expected: 0
    }
}
