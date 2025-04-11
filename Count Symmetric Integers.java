class Solution {
    public int find_sum(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            String temp = Integer.toString(i);
            if(temp.length() % 2 == 0){
                int cal_length = temp.length()/2;
                String first = temp.substring(0,cal_length);
                String second = temp.substring(cal_length,temp.length());
                int first_Int = Integer.parseInt(first);
                int second_Int = Integer.parseInt(second);
                if(find_sum(first_Int) ==  find_sum(second_Int)){
                    count++;
                }
            }
        }
        return count;
    }
}
