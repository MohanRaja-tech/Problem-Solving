class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> lst = new ArrayList<>();
        int input = 1;
        for(int num : target){
            while(input < num){
                lst.add("Push");
                lst.add("Pop");
                input++;
            }
            lst.add("Push");
            input++;
        }


        return lst;
    }
}
