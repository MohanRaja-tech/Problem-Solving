class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> aset = new HashSet<>();
        Set<Integer> bset = new HashSet<>();
        int index = 0;
        int[] result = new int[A.length];
        for(int i=0;i<A.length;i++){
            aset.add(A[i]);
            bset.add(B[i]);
            int count = 0;
            for(int j : aset){
                if(bset.contains(j)){
                    count += 1;
                }
            }
            result[index++] = count;
        }
        return result;
    }
}
