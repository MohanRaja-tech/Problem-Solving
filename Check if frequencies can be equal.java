class Solution {
    boolean sameFreq(String s) {
       
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        Map<Integer, Integer> freqmap = new HashMap<>();
        for (char ch : map.keySet()) {
            int freq = map.get(ch);
            freqmap.put(freq, freqmap.getOrDefault(freq, 0) + 1);
        }
        if (freqmap.size() == 1) return true;

        if (freqmap.size() > 2) return false;
        
       Iterator<Map.Entry<Integer,Integer>> it = freqmap.entrySet().iterator();
       Map.Entry<Integer,Integer> e1 = it.next();
       Map.Entry<Integer,Integer> e2 = it.next();

        int f1 = e1.getKey();
        int c1 = e1.getValue(); 
        int f2 = e2.getKey(); 
        int c2 = e2.getValue(); 

        if ((f1 == 1 && c1 == 1) || (f2 == 1 && c2 == 1)) return true;

        if (Math.abs(f1 - f2) == 1) {
            if ((f1 > f2 && c1 == 1) || (f2 > f1 && c2 == 1)) return true;
        }

        return false;
    }
}
