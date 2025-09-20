class Solution {
    public void setZeroes(int[][] matrix) {
        Map<Integer,List<List<Integer>>> map = new HashMap<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    List<Integer> temp1 = new ArrayList<>();
                    temp1.add(i);
                    temp1.add(j);
                    if(!map.containsKey(matrix[i][j])){
                        map.put(matrix[i][j],new ArrayList<>());
                        map.get(matrix[i][j]).add(temp1);
                    }
                    else{
                        map.get(matrix[i][j]).add(temp1);
                    }
                }
            }
        }
      for(List<List<Integer>> coordinates : map.values()){
            for(List<Integer> lst : coordinates){
                int row = lst.get(0);
                int col = lst.get(1);
                for(int  i=0;i<n;i++){
                    matrix[row][i] = 0;
                }
                for(int j=0;j<m;j++){
                    matrix[j][col] = 0;
                }
            }
      }
        
    }
}