class Solution {
    public int[] nextGreaterElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int res = -1;
            boolean found = false;

            
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > temp) {
                    res = nums[j];
                    found = true;
                    break;
                }
            }

            
            if (!found) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] > temp) {
                        res = nums[j];
                        break;  
                    }
                }
            }

            result.add(res);
        }

     
        int[] fin = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            fin[i] = result.get(i);
        }

        return fin;
    }
}
