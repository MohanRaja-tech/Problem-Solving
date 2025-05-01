class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(arr1);
        for(int num : arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int index  = 0;
        for(int  num : arr2){
            int value = map.get(num);
            while(map.get(num) != 0){
                arr1[index++] = num;
                map.put(num,map.get(num)-1);
            }
            map.remove(num);
        }
        List<Integer> remaining = new ArrayList<>(map.keySet());
        Collections.sort(remaining);
        for(int num: remaining){
            int value = map.get(num);
            while(value != 0){
                arr1[index++] = num;
                value--;
            }
        }
        return arr1;
        }
        
    }
