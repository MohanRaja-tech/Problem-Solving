class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> lst = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    lst.add(temp);
                
                }
            }
        }
       
        while(!lst.isEmpty()){
            List<Integer> temp = lst.get(0);
            ;lst.remove(0);
            int row = temp.get(0);
            int col = temp.get(1);
            // Row zeroes
            for(int i=0;i<n;i++){
                matrix[row][i] = 0;
            }
            // Col Zeroes
            for(int i=0;i<m;i++){
                matrix[i][col] = 0;
            }
        }

    }
}