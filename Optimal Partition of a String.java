class Solution {
    public int partitionString(String s) {
        List<String> lst = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        String temp = "";
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                temp += s.charAt(i);
                set.add(s.charAt(i));
            }
            else{
                lst.add(temp);
                set.clear();
                temp = "" + s.charAt(i);
                set.add(s.charAt(i));
            }
        }
        if(!temp.isEmpty()){
            lst.add(temp);
        }
        return lst.size();
    }
}
