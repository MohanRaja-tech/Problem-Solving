class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> lst = new ArrayList<>();
        for (int num : stones) {
            lst.add(num);
        }

        while (lst.size() > 1) {
            Collections.sort(lst); 
            int n = lst.size();
            int stone1 = lst.get(n - 1); 
            int stone2 = lst.get(n - 2); 

            lst.remove(n - 1); 
            lst.remove(n - 2); 

            if (stone1 != stone2) {
                lst.add(Math.abs(stone1 - stone2));
            }
        }

        return lst.isEmpty() ? 0 : lst.get(0);
    }
}