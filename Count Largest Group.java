class Solution {
    public int digits(int num){
        int sum = 0;
        while(num > 0){
            int rev = num%10;
            sum += rev;
            num /= 10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            int key = digits(i);
            if(map.containsKey(key)){
               map.get(key).add(i);
            }
            else{
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(key,temp);
            }
        }
        int max = 0;
        for(List<Integer> num : map.values()){
            if(num.size() > max){
                max = num.size();
            }
        }
        int sum = 0;
        for(List<Integer> num : map.values()){
            if(num.size() == max){
                sum++;
            }
        }
        return sum;
    }
}
