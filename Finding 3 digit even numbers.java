class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i == j || j == k || i == k){
                        continue;
                    }
                    int num = digits[i]*100 + digits[j]*10+ digits[k];
                    if(num%2 == 0 && num >= 100 && !set.contains(num)){
                        set.add(num);
                    }
                }
            }
        }
        int[] arr = new int[set.size()];
        int index = 0;
        for(int num : set){
            arr[index++] = num;
        }
        Arrays.sort(arr);
        return arr;
    }
}
