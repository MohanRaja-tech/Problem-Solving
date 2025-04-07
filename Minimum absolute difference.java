class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int[] temp_arr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp_arr[i] = arr[i];
        }
        Arrays.sort(temp_arr);
        int min_diff = Integer.MAX_VALUE;
        for(int i=1;i<temp_arr.length;i++){
            min_diff = Math.min(min_diff,Math.abs(temp_arr[i]- temp_arr[i-1])); 
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < temp_arr.length; i++) {
            if (temp_arr[i] - temp_arr[i - 1] == min_diff) {
                List<Integer> temp = new ArrayList<>();
                temp.add(temp_arr[i - 1]);
                temp.add(temp_arr[i]);
                result.add(temp);
            }
        }
        Collections.sort(result,(a,b) -> Integer.compare(a.get(0),b.get(0)));
        return result;
    }
}
