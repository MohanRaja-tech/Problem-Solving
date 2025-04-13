class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        char[] result = new char[n];
        long totalshift = 0;
        for(int i=n-1;i>=0;i--){
            totalshift = (totalshift + shifts[i])%26;
            char shifted = (char)((s.charAt(i)-'a'+totalshift)%26+'a');
            result[i] = shifted;
        }
        return new String(result);
    }
}
