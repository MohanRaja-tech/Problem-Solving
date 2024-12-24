import java.util.HashSet;
import java.util.Set;

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

    
        for (int i = left; i <= right; i++) {
            String temp = words[i];
            if (temp.length() > 0 && set.contains(temp.charAt(0)) && set.contains(temp.charAt(temp.length() - 1))) {
                count += 1;
            }
        }
        return count;
    }
}
