import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder temp =  new StringBuilder();
        for(int nums:num){
            temp.append(Integer.toString(nums));
        }

        BigInteger num1 = new BigInteger(temp.toString());
        BigInteger num2 = BigInteger.valueOf(k);
        BigInteger result = num1.add(num2);
        String fin = result.toString();
        List<Integer> res = new ArrayList<>();
        for(char ch:fin.toCharArray()){
            res.add(ch-'0');
        }
        return res;
    }
}
