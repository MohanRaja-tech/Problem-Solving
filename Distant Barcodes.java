import java.util.*;

class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : barcodes) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> sortedBarcodes = new ArrayList<>(map.keySet());
        sortedBarcodes.sort((a, b) -> map.get(b) - map.get(a));
        
        int[] res = new int[barcodes.length];
        int index = 0;
        
        for (int i : sortedBarcodes) {
            int freq = map.get(i);
            while (freq-- > 0) {
                res[index] = i;
                index += 2;
                if (index >= barcodes.length) {
                    index = 1;
                }
            }
        }
        
        return res;
    }
}
