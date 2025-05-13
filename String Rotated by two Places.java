class Solution {
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    public static void reverse(int i,int j,char[] arr){
        while(i < j){
            char temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static boolean isRotated(String s1, String s2) {
        
        if(s1.length() ==0 || s2.length() == 0){
            return false;
        }
        if(s1.length() == 1||s2.length() == 1){
            return false;
        }
        char[] rot1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        reverse(0,rot1.length-1,rot1);
        reverse(0,2-1,rot1);
        reverse(2,rot1.length-1,rot1);
        if(Arrays.equals(rot1,ch2)){
            return true;
        }
        char[] rot2 = s1.toCharArray();
        reverse(0,2-1,rot2);
        reverse(2,rot2.length-1,rot2);
        reverse(0,rot2.length-1,rot2);
        return Arrays.equals(rot2,ch2);
    }
}
