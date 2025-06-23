class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> lst  = new ArrayList<>();
        int index = 0;
        while(index+k <= s.length()){
            String part = s.substring(index,index+k);
            lst.add(part);
            index += k;
        }
        if(s.length()%k != 0){
        StringBuilder sb = new StringBuilder();
        for(int i=index;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        while(sb.length() < k){
            sb.append(fill);
        }
        lst.add(sb.toString());
        }
        
        return lst.toArray(new String[0]);
    }
}
