class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        List<Integer> lst = new ArrayList<>();
        //Set<Integer> visited = new ArrayList<>();
        for(int num:nums2){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        for(int num:nums1){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for(int num:map1.keySet()){
            if(map2.containsKey(num)){
            int freq = Math.min(map1.get(num),map2.get(num));
            for(int i=0;i<freq;i++){
                lst.add(num);
            }
            }
            
        }
    
        

        int[] res = new int[lst.size()];
        int idx = 0;
        for(int num:lst){
            res[idx++] = num;
        }
        return res;
    }
}
