class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> lst = new ArrayList<>();
        lst.add(words[0]);  

        for (int i = 1; i < words.length; i++) {
            char[] prev = words[i - 1].toCharArray();
            char[] curr = words[i].toCharArray();
            Arrays.sort(prev);
            Arrays.sort(curr);

          
            if (!Arrays.equals(prev, curr)) {
                lst.add(words[i]);
            }
        }
        return lst;
    }
}
