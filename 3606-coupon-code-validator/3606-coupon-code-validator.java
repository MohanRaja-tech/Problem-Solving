class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String,Integer> map = new HashMap<>();
        map.put("electronics",1);
        map.put("grocery",2);
        map.put("pharmacy",3);
        map.put("restaurant",4);
        List<int[]> valid = new ArrayList<>();
        int n = code.length;
        for(int i=0;i<n;i++){
            String tempc = code[i];
            String tempb = businessLine[i];
            boolean flag  = isActive[i];
            if(flag){
                if(map.containsKey(tempb)){
                    boolean tempflag = true;
                        for(char ch:tempc.toCharArray()){
                        if(ch >= 'A' && ch <= 'Z' || ch == '_' || ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z') continue;
                        else tempflag = false;
                    }
                    if(tempflag && tempc.length() > 0) valid.add(new int[]{i,map.get(tempb)});
                }
                else{
                    continue;
                }
            }
            else continue;
        }
        List<String> lst = new ArrayList<>();
        valid.sort((i,j) -> {
            int p1 = i[1];
            int p2 = j[1];
            if(p1 != p2) return Integer.compare(p1,p2);
            return code[i[0]].compareTo(code[j[0]]);
        });
        for(int[] pair:valid){
            int idx = pair[0];
            lst.add(code[idx]);
        }
        return lst;
    }
}