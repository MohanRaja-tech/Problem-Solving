class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> lst = new ArrayList<>();
        lst.add(words[0]);
        int prevgroup = groups[0];
        for(int i=1;i<words.length;i++){
            if(groups[i] != prevgroup){
                lst.add(words[i]);
                prevgroup = groups[i];
            }
        }
        return lst;
    }
}
