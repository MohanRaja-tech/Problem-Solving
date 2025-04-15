class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> lst = new ArrayList<>();
        String digits = "123456789";
        int low_length = String.valueOf(low).length();
        int high_length = String.valueOf(high).length();
        for(int left=low_length;left<=high_length;left++){
            for(int right=0;right<=digits.length()-left;right++){
                String temp = digits.substring(right,right+left);
                int num = Integer.parseInt(temp);
                if(num >= low && num <= high){
                    lst.add(num);
                }
                
            }
        }
        return lst;
    }
}
