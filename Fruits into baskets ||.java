class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] used = new boolean[fruits.length];
        int unplaced = fruits.length;
        for(int num:fruits){
            for(int j=0;j<fruits.length;j++){
                if(!used[j] && num <= baskets[j]){
                    unplaced--;
                    used[j] = true;
                    break;
                }
            }
        }
        return unplaced;
    }
}
