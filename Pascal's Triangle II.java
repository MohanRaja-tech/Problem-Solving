class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lst = new ArrayList<>();
        if(rowIndex == 0){
            lst.add(new ArrayList<>(Arrays.asList(1)));
            return lst.get(0);
        }
        if(rowIndex == 1){
            lst.add(new ArrayList<>(Arrays.asList(1)));
             lst.add(new ArrayList<>(Arrays.asList(1,1)));
            return lst.get(1);
        }
        lst.add(new ArrayList<>(Arrays.asList(1)));
        lst.add(new ArrayList<>(Arrays.asList(1,1)));
        List<Integer> find = lst.get(1);
        for(int i=2;i<=rowIndex;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=1;j<find.size();j++){
                temp.add(find.get(j-1)+find.get(j));
            }
            temp.add(1);
            lst.add(temp);
            find = temp;
        }
        return lst.get(rowIndex);
    }
}
