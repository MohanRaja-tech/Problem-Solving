
class Solution {
    public int maxProduct(String[] words) {
        int maxProd = 0;
        List<Set<Character>> wordSets = new ArrayList<>();

        
        for (String word : words) {
            Set<Character> set = new HashSet<>();
            for (char c : word.toCharArray()) {
                set.add(c);
            }
            wordSets.add(set);
        }

        
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                boolean flag = true;

              
                for (char c : wordSets.get(i)) {
                    if (wordSets.get(j).contains(c)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    int product = words[i].length() * words[j].length();
                    maxProd = Math.max(maxProd, product);
                }
            }
        }

        return maxProd;
    }
}
